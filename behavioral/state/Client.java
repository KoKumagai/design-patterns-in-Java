package behavioral.state;

import behavioral.state.context.TrafficLight;
import behavioral.state.state.Green;
import behavioral.state.state.Red;
import behavioral.state.state.Yellow;

public class Client {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        Red red = new Red();
        red.flash(trafficLight); // A flashing red traffic light

        Yellow yellow = new Yellow();
        yellow.flash(trafficLight); // A flashing yellow traffic light

        Green green = new Green();
        green.flash(trafficLight); // A flashing green traffic light
    }

}