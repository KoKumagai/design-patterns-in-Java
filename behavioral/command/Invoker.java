package behavioral.command;

import java.util.Iterator;
import java.util.Stack;

public class Invoker {
    private Stack<Command> commands = new Stack<Command>();

    public void addCommnad(Command command) {
        commands.push(command);
    }

    public void undoCommnad() {
        commands.pop();
    }

    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }
}