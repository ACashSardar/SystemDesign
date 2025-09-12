package LLD.DesignPatterns.Creational.AbstractFactory;

public interface VehicleAbstractFactory {
    // VehicleFactory has a vehicle
    Vehicle getVehicle(String name);
}
