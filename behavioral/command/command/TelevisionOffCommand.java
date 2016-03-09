package behavioral.command.command;

import behavioral.command.receiver.Television;

public class TelevisionOffCommand implements Command {

    private Television tv;

    public TelevisionOffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public  void execute() {
        tv.turnOff();
    }

}