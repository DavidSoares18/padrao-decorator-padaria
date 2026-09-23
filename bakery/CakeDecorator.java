package bakery;

/**
 * Decorator abstrato: E um Cake (pode ser usado onde se espera um Cake)
 * e TEM um Cake (o bolo que esta sendo decorado).
 * Por padrao apenas repassa (delega) as chamadas ao bolo embrulhado;
 * cada decorador concreto acrescenta o seu comportamento.
 */
public abstract class CakeDecorator extends Cake {
    protected final Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription();
    }
}
