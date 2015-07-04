package structural.bridge;

public class Abstraction {
    private Implementor implementor;
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    public void abstractMethod() {
        implementor.implementMethod();
    }
}