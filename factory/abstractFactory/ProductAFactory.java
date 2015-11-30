package factory.abstractFactory;

public class ProductAFactory extends AbstractFactory {
    public AbstractProductA getProductA(String name) {
        if(name.equalsIgnoreCase("A1")) {
            return new ConcreteProductA1();
        } else if(name.equalsIgnoreCase("A2")) {
            return new ConcreteProductA2();
        }
        return null;
    }

    AbstractProductB getProductB(String name) {
        return null;
    }
}