package behavioral.command;

import behavioral.command.command.Command;
import behavioral.command.command.TelevisionOffCommand;
import behavioral.command.command.TelevisionOnCommand;
import behavioral.command.invoker.RemoteControl;
import behavioral.command.receiver.Television;

public class Client {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Television tv = new Television();

        Command lightsOn = new TelevisionOnCommand(tv);
        control.setCommand(lightsOn);
        control.pressButton(); // Power is on.

        Command lightsOff = new TelevisionOffCommand(tv);
        control.setCommand(lightsOff);
        control.pressButton(); // Power is off.
    }

}