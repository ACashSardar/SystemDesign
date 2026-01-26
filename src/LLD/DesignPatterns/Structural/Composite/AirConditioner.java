package LLD.DesignPatterns.Structural.Composite;

public class AirConditioner implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("AirConditioner turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioner turned OFF");
    }
}
