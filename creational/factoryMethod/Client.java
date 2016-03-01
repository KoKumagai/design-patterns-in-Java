package factory.factoryMethod;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.method1();
        product.method2();
    }
}