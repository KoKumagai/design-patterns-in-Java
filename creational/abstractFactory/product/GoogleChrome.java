package creational.abstractFactory.product;

public class GoogleChrome implements Browser {

    @Override
    public void render() {
        System.out.println("Google Chrome is rendering a website.");
    }

}