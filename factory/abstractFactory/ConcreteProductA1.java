package factory.abstractFactory;

public class ConcreteProductA1 implements AbstractProductA {
    @Override
    public void execute() {
        System.out.println("A1#execute()");
    }
}