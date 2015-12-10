package behavioral.visitor;

public class ConcreteAcceptorA implements Acceptor {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}