package LLD.DesignPatterns.Behavioral.State;

public class GreenSignal implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        context.setTrafficLightState(new YellowSignal());
    }

    @Override
    public String getColour() {
        return "GREEN SIGNAL";
    }
}
