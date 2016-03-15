package behavioral.state.state;

import behavioral.state.context.TrafficLight;

public class Green implements State {

    @Override
    public void flash(TrafficLight trafficLight) {
        System.out.println("A flashing green traffic light");
        trafficLight.setState(this);
    }

}