package behavioral.command;

public class ConcreteCommandA implements Command {
    private int id;
    protected Receiver receiver;

    public ConcreteCommandA(int id) {
        this.id = id;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action("ConcreteCommandA#execute()" + " : " + id);
    }
}