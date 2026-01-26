package LLD.DesignPatterns.Structural.Adapter;

public class TemperatureAdapter implements TemperatureService {

    TemperatureSensor sensor;

    public TemperatureAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureInCelsius() {
        double f = sensor.getTemperatureInFahrenheit();
        return (f - 32) * 5 / 9;
    }
}
