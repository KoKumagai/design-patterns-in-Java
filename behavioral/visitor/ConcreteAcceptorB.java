package behavioral.visitor;

public class ConcreteAcceptorB implements Acceptor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}