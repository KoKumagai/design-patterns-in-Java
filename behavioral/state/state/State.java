package behavioral.state.state;

import behavioral.state.context.TrafficLight;

public interface State {

    void flash(TrafficLight trafficLight);

}