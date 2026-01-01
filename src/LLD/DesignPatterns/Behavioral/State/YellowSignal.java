package LLD.DesignPatterns.Behavioral.State;

public class YellowSignal implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        context.setTrafficLightState(new RedSignal());
    }

    @Override
    public String getColour() {
        return "YELLOW SIGNAL";
    }
}
