package structural.adapter2;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetMethod1();
        target.targetMethod2();
    }
}