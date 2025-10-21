package LLD.DesignPatterns.Behavioral.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy.");
    }
}
