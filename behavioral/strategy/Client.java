package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyAdd());
        System.out.println(context.executeStrategy(3, 5));

        context = new Context(new ConcreteStrategyMultiply());
        System.out.println(context.executeStrategy(3, 5));
    }
}