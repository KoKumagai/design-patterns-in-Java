package creational.abstractFactory.product;

public class MicrosoftEdge implements Browser {

    @Override
    public void render() {
        System.out.println("Microsoft Edge is rendering a website.");
    }

}