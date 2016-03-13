package behavioral.memento;

import behavioral.memento.careTaker.Caretaker;
import behavioral.memento.originator.Originator;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("first");
        System.out.println(originator.getState()); // first

        originator.setState("second");
        System.out.println(originator.getState()); // second
        caretaker.add(originator.saveStateToMemento());

        originator.setState("third");
        System.out.println(originator.getState()); // third
        caretaker.add(originator.saveStateToMemento());

        originator.setState("fourth");
        System.out.println(originator.getState()); // fourth

        originator.restoreStateFrom(caretaker.get(1));
        System.out.println(originator.getState()); // third
    }

}