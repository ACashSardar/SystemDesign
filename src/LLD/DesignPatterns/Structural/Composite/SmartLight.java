package LLD.DesignPatterns.Structural.Composite;

public class SmartLight implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("SmartLight turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLight turned OFF");
    }
}
