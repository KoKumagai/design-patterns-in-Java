package creational.abstractFactory.product;

public class Safari implements Browser {

    @Override
    public void render() {
        System.out.println("Safari is rendering a website.");
    }

}