package behavioral.visitor;

public interface Acceptor {
    public abstract void accept(Visitor visitor);
}