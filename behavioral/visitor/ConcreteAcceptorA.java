package behavioral.visitor;

public class ConcreteAcceptorA implements Acceptor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}