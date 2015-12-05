package behavioral.state;

public class ConcreteRunState implements State {
    public void execute(Context context) {
        System.out.println("Run");
        context.setState(this);   
    }

    public void printState() {
        System.out.println("Running");
    }
}