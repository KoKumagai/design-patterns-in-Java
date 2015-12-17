package behavioral.template;

public class Client {
    public static void main(String[] args) {
        AbstractClass obj = new ConcreteClass();
        obj.templateMethod();
    }
}