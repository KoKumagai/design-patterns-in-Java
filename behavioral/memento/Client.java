package behavioral.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("first");
        originator.setState("second");
        careTaker.add(originator.save());

        originator.setState("third");
        careTaker.add(originator.save());

        originator.setState("fourth");

        System.out.println(originator.getState());

        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println(originator.getState());

        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println(originator.getState());
    }
}