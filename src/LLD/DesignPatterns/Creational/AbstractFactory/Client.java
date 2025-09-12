package LLD.DesignPatterns.Creational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactoryProducer factoryProducer = new AbstractFactoryProducer();
        VehicleAbstractFactory luxuryFactory = factoryProducer.getFactory("Luxury");
        Vehicle luxuryVehicle = luxuryFactory.getVehicle("Bugatti");
        luxuryVehicle.engineStart();
    }
}
