package LLD.DesignPatterns.Behavioral.State;

public class RedSignal implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        context.setTrafficLightState(new GreenSignal());
    }

    @Override
    public String getColour() {
        return "RED SIGNAL";
    }
}
