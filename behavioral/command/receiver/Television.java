package behavioral.command.receiver;

public class Television {

    private boolean power;

    public void turnOn() {
        power = true;
        printPower();
    }

    public void turnOff() {
        power = false;
        printPower();
    }

    private void printPower() {
        if (power) {
            System.out.println("Power is on.");
        } else {
            System.out.println("Power is off.");
        }
    }

}