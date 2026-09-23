package bakery;

/**
 * Bolo com um dizer: nao altera o custo e acrescenta
 * with saying "X" no final do nome.
 */
public class SayingDecorator extends CakeDecorator {
    private final String saying;

    public SayingDecorator(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    // getCost() nao e sobrescrito: herda de CakeDecorator, que so repassa (+$0)

    @Override
    public String getDescription() {
        return super.getDescription() + " with saying \"" + saying + "\"";
    }
}