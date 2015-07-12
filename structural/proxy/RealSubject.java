package structural.proxy;

public class RealSubject extends Subject {
    public void requestA(String name) {
        System.out.println("RealSubject#requestA");
        super.name = name;
    }
    public void requestB() {
        System.out.println("RealSubject#requestB");
    }
    public void requestC() {
        System.out.println("name: " + name);
        System.out.println("RealSubject#requestC");
    }
}