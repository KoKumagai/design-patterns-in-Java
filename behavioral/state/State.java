package behavioral.state;

public interface State {
    public void execute(Context context);
    public void printState();
}