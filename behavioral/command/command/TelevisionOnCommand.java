package behavioral.command.command;

import behavioral.command.receiver.Television;

public class TelevisionOnCommand implements Command {

    private Television tv;

    public TelevisionOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public  void execute() {
        tv.turnOn();
    }

}