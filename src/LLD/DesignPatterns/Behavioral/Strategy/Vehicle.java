package LLD.DesignPatterns.Behavioral.Strategy;

public class Vehicle {
    DriveStrategy strategy;

    Vehicle(DriveStrategy strategy) {
        this.strategy = strategy;
    }

    public void drive() {
        strategy.drive();
    }
}
