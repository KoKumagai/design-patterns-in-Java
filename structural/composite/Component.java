package structural.composite;

public abstract class Component {
    public abstract String getName();

    public void add(Component component) throws Exception {
        throw new Exception();
    }

    protected abstract void print(String name);
}