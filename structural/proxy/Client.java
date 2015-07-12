package structural.proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.requestA("Ko");
        subject.requestB();
        subject.requestC();
    }
}