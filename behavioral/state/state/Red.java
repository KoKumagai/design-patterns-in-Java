package behavioral.state.state;

import behavioral.state.context.TrafficLight;

public class Red implements State {

    @Override
    public void flash(TrafficLight trafficLight) {
        System.out.println("A flashing red traffic light");
        trafficLight.setState(this);
    }

}