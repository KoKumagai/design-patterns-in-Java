package behavioral.template.template;

public abstract class Sandwich {

    abstract void chooseBread();

    abstract void spreadFilling();

    abstract void putCondiment();

    public final void make() {
        chooseBread();
        spreadFilling();
        putCondiment();
    }

}
