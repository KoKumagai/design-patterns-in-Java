package factory.factoryMethod;

public abstract class Creator {
    public abstract Product factoryMethod();
    public final Product create() {
        Product product = factoryMethod();
        return product;
    }
}