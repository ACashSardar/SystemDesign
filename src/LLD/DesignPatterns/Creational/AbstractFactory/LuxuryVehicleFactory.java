package LLD.DesignPatterns.Creational.AbstractFactory;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String name) {
        if (name.equals("Bugatti")) {
            return new Bugatti();
        } else if (name.equals("Lamborghini")) {
            return new Lamborghini();
        }
        return null;
    }
}
