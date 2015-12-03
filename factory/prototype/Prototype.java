package factory.prototype;

public abstract class Prototype implements Cloneable {
    private int id;

    abstract void execute();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object createClone() {
        Object clone = null;

        try {
            clone = super.clone();   
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}