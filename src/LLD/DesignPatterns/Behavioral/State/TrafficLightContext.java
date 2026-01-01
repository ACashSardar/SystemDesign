package LLD.DesignPatterns.Behavioral.State;

public class TrafficLightContext {
    TrafficLightState trafficLightState;

    TrafficLightContext() {
        trafficLightState = new GreenSignal();
    }

    void next() {
        trafficLightState.next(this);
    }

    public void setTrafficLightState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public TrafficLightState getTrafficLightState() {
        return trafficLightState;
    }

    public String getColour() {
        return trafficLightState.getColour();
    }
}
