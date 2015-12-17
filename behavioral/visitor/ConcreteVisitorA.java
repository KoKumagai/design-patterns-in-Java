package behavioral.visitor;

public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteAcceptorA acceptorA) {
        System.out.println(this.getClass().getSimpleName() + " is visiting at " + acceptorA.getClass().getSimpleName());
    }

    @Override
    public void visit(ConcreteAcceptorB acceptorB) {
        System.out.println(this.getClass().getSimpleName() + " is visiting at " + acceptorB.getClass().getSimpleName());
    }
}