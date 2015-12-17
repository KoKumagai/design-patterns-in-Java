package behavioral.command;

public class ConcreteReceiver implements Receiver {
    @Override
    public void action(String msg) {
        System.out.println(msg);
    }
}