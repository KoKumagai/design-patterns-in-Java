package creational.abstractFactory.product;

public class Osx implements Os {

    @Override
    public void execute() {
        System.out.println("OS X is executing programs.");
    }

}