package LLD.DesignPatterns.Behavioral.Strategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        // common strategy for OffRoadVehicle and SportsVehicle
        super(new SportsDriveStrategy());
    }
}
