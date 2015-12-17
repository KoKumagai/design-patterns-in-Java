package structural.composite;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends Component {
    private String name;
    private List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    protected void print(String name) {
        System.out.println(name + "-" + this.name);
        Iterator<Component> it = components.iterator();
        while (it.hasNext()) {
            it.next().print(name + "-" + this.name);
        }
    }

    @Override
    public void add(Component component) throws Exception {
        components.add(component);
    }
}