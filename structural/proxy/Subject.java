package structural.proxy;

public abstract class Subject {
    protected String name;
    public abstract void requestA(String name);
    public abstract void requestB();
    public abstract void requestC();
}