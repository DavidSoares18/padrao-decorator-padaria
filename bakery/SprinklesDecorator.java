package bakery;

/**
 * Bolo com granulado: +$2 e "with sprinkles" no final do nome.
 */
public class SprinklesDecorator extends CakeDecorator {
    private static final int EXTRA_COST = 2;

    public SprinklesDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + EXTRA_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sprinkles";
    }
}