package LLD.DesignPatterns.Creational.AbstractFactory;

public class OrdinaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String name) {
        if (name.equals("Tata")) {
            return new Tata();
        } else if (name.equals("Maruti")) {
            return new Maruti();
        }
        return null;
    }
}
