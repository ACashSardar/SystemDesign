package LLD.DesignPatterns.Creational.AbstractFactory;

public class FactoryProducer {
    public VehicleFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Luxury")) {
            return new LuxuryVehicleFactory();
        } else if (type.equalsIgnoreCase("Ordinary")) {
            return new OrdinaryVehicleFactory();
        }
        return null;
    }
}
