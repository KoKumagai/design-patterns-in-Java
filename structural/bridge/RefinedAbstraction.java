package structural.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    public void refinedMethod() {
        System.out.println("refinedMethod");
    }
}