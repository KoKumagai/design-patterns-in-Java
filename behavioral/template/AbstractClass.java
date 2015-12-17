package behavioral.template;

public abstract class AbstractClass {
    protected abstract void method1();
    protected abstract void method2();
    public final void templateMethod() {
        method1();
        method2();
    }
}