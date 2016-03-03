package creational.abstractFactory.factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        } else switch (choice.toUpperCase()) {
            case "OS":
                return new OsFactory();
            case "BROWSER":
                return new BrowserFactory();
            default:
                return null;
        }
    }

}