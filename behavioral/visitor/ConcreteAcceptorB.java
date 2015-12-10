package behavioral.visitor;

public class ConcreteAcceptorB implements Acceptor {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}