package structural.adapter2;

public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void targetMethod1() {
        adaptee.method1();
    }

    @Override
    public void targetMethod2() {
        adaptee.method2();
    }
}