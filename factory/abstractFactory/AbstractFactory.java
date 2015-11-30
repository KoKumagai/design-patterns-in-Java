package factory.abstractFactory;

public abstract class AbstractFactory {
    abstract AbstractProductA getProductA(String name);
    abstract AbstractProductB getProductB(String name);
}
