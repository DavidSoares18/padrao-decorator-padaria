package bakery;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();

        // 1) Bolo de chocolate
        Cake chocolate = new ChocolateCake();
        order.addCake(chocolate);

        // 2) Bolo de baunilha com o dizer "PLAIN!"
        Cake plain = new VanillaCake();
        plain = new SayingDecorator(plain, "PLAIN!");
        order.addCake(plain);

        // 3) Bolo de baunilha com granulado com os dizeres "FANCY!" (como na saida de exemplo)
        Cake fancy = new VanillaCake();
        fancy = new SprinklesDecorator(fancy);
        fancy = new SayingDecorator(fancy, "FANCY!");
        order.addCake(fancy);

        // 4) Bolo de morango em varias camadas, granulado duplo e dois dizeres.
        //    Cada linha embrulha o bolo anterior: a ordem das linhas e a ordem da descricao.
        Cake everything = new StrawberryCake();          // 20
        everything = new MultiLayerDecorator(everything); // +5
        everything = new SprinklesDecorator(everything);  // +2
        everything = new SprinklesDecorator(everything);  // +2
        everything = new SayingDecorator(everything, "One of");
        everything = new SayingDecorator(everything, "EVERYTHING");
        order.addCake(everything);                        // total: 29

        // Print the order
        order.printOrder();
    }
}