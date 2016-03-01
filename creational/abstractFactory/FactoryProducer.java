package factory.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("A")) {
           return new ProductAFactory();
        }else if(choice.equalsIgnoreCase("B")) {
           return new ProductBFactory();
        }
        return null;
     }
}