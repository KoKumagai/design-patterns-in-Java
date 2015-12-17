package behavioral.state;

public class ConcreteStopState implements State {
    @Override
    public void execute(Context context) {
        System.out.println("Stop");
        context.setState(this);
    }

    @Override
    public void printState() {
        System.out.println("Stopping");
    }
}