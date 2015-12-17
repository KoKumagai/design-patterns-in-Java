package behavioral.command;

public class ConcreteCommandB implements Command {
    private int id;
    protected Receiver receiver;

    public ConcreteCommandB(int id) {
        this.id = id;
    }

    @Override
    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action("ConcreteCommandB#execute()" + " : " + id);
    }
}