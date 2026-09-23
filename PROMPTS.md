# Uso de IA nesta questão

## Prompt utilizado

Ferramenta: Claude (Anthropic). Anexos: `Lista Avaliativa I.pdf` (enunciado) e `src.zip` (código inicial).

> Contexto: projeto Java com o pacote `bakery` em anexo (`Cake`, `VanillaCake`, `ChocolateCake`, `Order`,
> `Main`). Hoje a padaria só faz dois bolos, ambos com custo fixo definido em `Cake`.
>
> Objetivo: permitir bolos compostos usando o padrão Decorator, com decoradores de várias camadas (+$5 e
> prefixo "Multi-layered"), granulado (+$2 e sufixo "with sprinkles", podendo ser aplicado mais de uma vez)
> e dizer (+$0 e sufixo with saying "X"), além de um novo tipo de bolo (morango) que custa o dobro do
> padrão. Condições do enunciado: acrescentar um novo tipo de bolo ou uma nova forma de decoração não pode
> alterar o código existente, exceto para instanciá-lo.
>
> Não me dê a solução pronta. Me dê um passo a passo (tutorial) incremental para eu implementar, seguindo
> estas condições:
> 1. cada etapa deve deixar o projeto compilando, para virar um commit isolado;
> 2. em cada etapa, diga quais arquivos mudam e qual é o papel de cada classe no padrão (componente,
>    componentes concretos, decorador abstrato, decoradores concretos);
> 3. explique por que o decorador precisa ao mesmo tempo herdar do componente e conter um componente, e
>    como a ordem em que os decoradores são aplicados afeta a descrição impressa;
> 4. termine com a verificação dos custos e das descrições contra o exemplo do enunciado, incluindo o bolo
>    de morango em várias camadas com granulado duplo e dois dizeres.

## Passo a passo (tutorial) sugerido pela IA para esta questão

| Passo | O que fazer | Commit correspondente |
|---|---|---|
| 1 | Criar o decorador abstrato `CakeDecorator`, que **é um** `Cake` e **tem um** `Cake`, delegando custo e descrição. | `Passo 1` |
| 2 | Criar `MultiLayerDecorator`: +$5 e "Multi-layered " na frente do nome. | `Passo 2` |
| 3 | Criar `SprinklesDecorator`: +$2 e " with sprinkles" no fim do nome. | `Passo 3` |
| 4 | Criar `SayingDecorator`: +$0 e ` with saying "X"` no fim do nome. | `Passo 4` |
| 5 | Criar `StrawberryCake`, que custa o dobro de um bolo padrão, **sem alterar** `Cake`. | `Passo 5` |
| 6 | Montar o pedido em `Main` com os quatro bolos do enunciado e imprimir. | `Passo 6` |
| 7 | Rodar e comparar com a saída de exemplo. | `Ajuste` |

## Ajustes feitos sobre o que a IA sugeriu

1. **"FANCY" x "FANCY!"** — o enunciado pede o dizer `"FANCY"`, mas a saída de exemplo mostra `"FANCY!"`.
   A primeira versão seguiu o texto; ajustamos para bater com a saída esperada (commit "Ajuste:").
2. **Construção aninhada ilegível** — o Passo 6 montava o bolo de morango com 6 construtores aninhados numa
   única expressão. Reescrevemos aplicando um decorador por linha (reatribuindo a variável `Cake`), o que
   deixa o "embrulho" do Decorator explícito e a ordem das linhas igual à ordem da descrição.