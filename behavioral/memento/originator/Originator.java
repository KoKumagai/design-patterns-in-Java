package behavioral.memento.originator;

import behavioral.memento.memento.Memento;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void restoreStateFrom(Memento memento) {
        state = memento.getState();
    }

}