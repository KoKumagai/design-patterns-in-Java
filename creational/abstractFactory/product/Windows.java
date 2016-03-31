package creational.abstractFactory.product;

public class Windows implements Os {

    @Override
    public void execute() {
        System.out.println("Windows is executing programs.");
    }

}