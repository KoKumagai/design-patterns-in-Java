package structural.proxy;

public class RealSubject extends Subject {
    @Override
    public void requestA(String name) {
        System.out.println("RealSubject#requestA");
        super.name = name;
    }

    @Override
    public void requestB() {
        System.out.println("RealSubject#requestB");
    }

    @Override
    public void requestC() {
        System.out.println("name: " + name);
        System.out.println("RealSubject#requestC");
    }
}