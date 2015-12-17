package behavioral.visitor;

public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteAcceptorA acceptorA) {
        System.out.println(this.getClass().getSimpleName() + " is staying at " + acceptorA.getClass().getSimpleName());
    }

    @Override
    public void visit(ConcreteAcceptorB acceptorB) {
        System.out.println(this.getClass().getSimpleName() + " is staying at " + acceptorB.getClass().getSimpleName());
    }
}