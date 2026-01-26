package LLD.DesignPatterns.Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        TemperatureService service = new TemperatureAdapter(new TemperatureSensor());
        double tempInCelsius = service.getTemperatureInCelsius();
        System.out.println("Temp=" + tempInCelsius + "C");
    }
}
