package LLD.DesignPatterns.Behavioral.State;

public interface TrafficLightState {
    void next(TrafficLightContext context);

    String getColour();
}
