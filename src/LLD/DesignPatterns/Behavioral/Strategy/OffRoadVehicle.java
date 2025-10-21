package LLD.DesignPatterns.Behavioral.Strategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        // common strategy for OffRoadVehicle and SportsVehicle
        super(new SportsDriveStrategy());
    }

}
