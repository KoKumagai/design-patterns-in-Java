package factory.abstractFactory;

public class ProductBFactory extends AbstractFactory {
    public AbstractProductA getProductA(String name) {
        return null;
    }

    AbstractProductB getProductB(String name) {
        if(name.equalsIgnoreCase("B1")) {
            return new ConcreteProductB1();
        } else if(name.equalsIgnoreCase("B2")) {
            return new ConcreteProductB2();
        }
        return null;
    }
}