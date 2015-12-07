package behavioral.command;

public interface Command {
    public abstract void setReceiver(Receiver receiver);
    public abstract void execute();
}