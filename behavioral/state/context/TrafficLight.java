package behavioral.state.context;

import behavioral.state.state.State;

public class TrafficLight {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}