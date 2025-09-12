package LLD.DesignPatterns.Creational.AbstractFactory;

public interface VehicleFactory {
    // VehicleFactory has a vehicle
    Vehicle getVehicle(String name);
}
