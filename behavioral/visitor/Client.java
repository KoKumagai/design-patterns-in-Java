package behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();
        Acceptor acceptorA = new ConcreteAcceptorA();
        Acceptor acceptorB = new ConcreteAcceptorB();

        acceptorA.accept(visitorA);
        acceptorB.accept(visitorA);
        acceptorA.accept(visitorB);
        acceptorB.accept(visitorB);
    }
}