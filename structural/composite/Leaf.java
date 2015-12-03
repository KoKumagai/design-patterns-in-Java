package structural.composite;

public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void print(String name) {
        System.out.println(name + "-" + this.name);
    }
}