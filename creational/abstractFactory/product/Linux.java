package creational.abstractFactory.product;

public class Linux implements Os {

    @Override
    public void execute() {
        System.out.println("Linux is executing programs.");
    }

}