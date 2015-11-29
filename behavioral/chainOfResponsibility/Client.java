package behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1("A", 10);
        Handler handler2 = new ConcreteHandler1("B", 100);
        Handler handler3 = new ConcreteHandler1("C", 777);
        Handler handler4 = new ConcreteHandler2("D", 777);
        handler1.setNext(handler2).setNext(handler3).setNext(handler4);
        handler1.request(777);
    }
}