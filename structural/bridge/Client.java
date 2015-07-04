package structural.bridge;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction(new ConcreteImplementor());
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(new ConcreteImplementor());
        abstraction.abstractMethod();
        refinedAbstraction.abstractMethod();
        refinedAbstraction.refinedMethod();
    }
}