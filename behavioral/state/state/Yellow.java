package behavioral.state.state;

import behavioral.state.context.TrafficLight;

public class Yellow implements State {

    @Override
    public void flash(TrafficLight trafficLight) {
        System.out.println("A flashing yellow traffic light");
        trafficLight.setState(this);
    }

}