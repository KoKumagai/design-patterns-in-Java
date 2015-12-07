package behavioral.command;

public class Client {
    public static void main(String[] args) {
        Command[] commandsA = new Command[3];
        Command[] commandsB = new Command[3];

        Receiver receiver = new ConcreteReceiver();
        Invoker invoker = new Invoker();

        for(int i = 0; i < commandsA.length; i++) {
            commandsA[i] = new ConcreteCommandA(i);
            commandsA[i].setReceiver(receiver);
            invoker.addCommnad(commandsA[i]);
        }

        for(int i = 0; i < commandsB.length; i++) {
            commandsB[i] = new ConcreteCommandB(i);
            commandsB[i].setReceiver(receiver);
            invoker.addCommnad(commandsB[i]);
        }

        invoker.execute();
        invoker.undoCommnad();
        invoker.execute();
    }
}