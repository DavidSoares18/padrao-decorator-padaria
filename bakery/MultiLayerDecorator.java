package bakery;

/**
 * Bolo em varias camadas: +$5 e "Multi-layered" na frente do nome.
 */
public class MultiLayerDecorator extends CakeDecorator {
    private static final int EXTRA_COST = 5;

    public MultiLayerDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + EXTRA_COST;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + super.getDescription();
    }
}