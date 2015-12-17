package behavioral.state;

public class ConcreteRunState implements State {
    @Override
    public void execute(Context context) {
        System.out.println("Run");
        context.setState(this);
    }

    @Override
    public void printState() {
        System.out.println("Running");
    }
}