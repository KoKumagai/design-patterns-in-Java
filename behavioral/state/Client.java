package behavioral.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        ConcreteRunState runState = new ConcreteRunState();
        runState.execute(context);

        context.getState().printState();

        ConcreteStopState stopState = new ConcreteStopState();
        stopState.execute(context);

        context.getState().printState();
    }
}