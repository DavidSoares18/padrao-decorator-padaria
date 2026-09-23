package bakery;

/**
 * Novo tipo de bolo: morango. Custa o dobro de um bolo padrao.
 * Nenhuma classe existente precisou ser alterada para cria-lo.
 */
public class StrawberryCake extends Cake {
    @Override
    public int getCost() {
        return super.getCost() * 2;
    }

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
}