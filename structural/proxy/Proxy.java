package structural.proxy;

public class Proxy extends Subject {
    RealSubject realSubject;
    public void requestA(String name) {
        System.out.println("Proxy#requestA");
        super.name = name;
    }
    public void requestB() {
        if (realSubject == null) {
            System.out.println("Proxy#requestB");
        } else {
            realSubject.requestB();
        }
    }
    public void requestC() {
        System.out.println("Proxy#requestC");
        if (realSubject == null) {
            realSubject = new RealSubject();
            realSubject.requestA(name);
        }
        realSubject.requestC();
    }
}