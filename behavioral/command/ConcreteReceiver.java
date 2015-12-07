package behavioral.command;

public class ConcreteReceiver implements Receiver {
    public void action(String msg) {
        System.out.println(msg);
    }
}