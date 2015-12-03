package structural.composite;

public class Client {
    public static void main(String[] args) {
        Composite compositeA = new Composite("A");
        Composite compositeB = new Composite("B");
        Composite compositeC = new Composite("C");
        Composite compositeD = new Composite("D");

        try {
            compositeA.add(compositeB);
            compositeA.add(compositeC);
            compositeB.add(compositeD);
            compositeC.add(new Leaf("a"));
            compositeB.add(new Leaf("b"));
            compositeA.add(new Leaf("c"));

            compositeA.print("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}