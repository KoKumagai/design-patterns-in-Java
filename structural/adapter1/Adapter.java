package structural.adapter1;

public class Adapter extends Adaptee implements Target {
    @Override
    public void targetMethod1() {
        method1();
    }

    @Override
    public void targetMethod2() {
        method2();
    }
}