package factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory AFactory = FactoryProducer.getFactory("A");

        AbstractProductA a1 = AFactory.getProductA("A1");
        a1.execute();

        AbstractProductA a2 = AFactory.getProductA("A2");
        a2.execute();


        AbstractFactory BFactory = FactoryProducer.getFactory("B");

        AbstractProductB b1 = BFactory.getProductB("B1");
        b1.run();

        AbstractProductB b2 = BFactory.getProductB("B2");
        b2.run(); 
    }
}