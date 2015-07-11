package structural.decorator;

public class Client {
    public static void main(String[] args) {
        Component componet = new ConcreteComponent();
        componet.method1();
        System.out.print("\n");
        componet.method2();
        System.out.print("\n\n");

        Component decorator = new ConcreteDecorator(componet);
        decorator.method1();
        System.out.print("\n");
        decorator.method2();
        System.out.print("\n");
    }
}