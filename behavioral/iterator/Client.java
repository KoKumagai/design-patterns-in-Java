package behavioral.iterator;

public class Client {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem(new Item("A"));
        aggregate.addItem(new Item("B"));
        aggregate.addItem(new Item("C"));
        Iterator it = aggregate.iterator();

        while(it.hasNext()) {
            Item item = (Item)it.next();
            System.out.println(item.getName());
        }
    }
}