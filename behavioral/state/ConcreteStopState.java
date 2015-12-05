package behavioral.state;

public class ConcreteStopState implements State {
    public void execute(Context context) {
        System.out.println("Stop");
        context.setState(this);   
    }

    public void printState() {
        System.out.println("Stopping");
    }
}