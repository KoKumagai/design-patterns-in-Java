package behavioral.visitor;

public interface Visitor {
    public abstract void visit(ConcreteAcceptorA acceptorA);
    public abstract void visit(ConcreteAcceptorB acceptorB);
}