package structural.decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void method1() {
        System.out.println("ConcreteDecorator#method1");
        component.method1();
        System.out.println(" LoL");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteDecorator#method2");
        component.method2();
        System.out.println(" :-)");
    }
}