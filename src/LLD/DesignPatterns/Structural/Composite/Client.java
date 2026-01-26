package LLD.DesignPatterns.Structural.Composite;

public class Client {
    public static void main(String[] args) {
        SmartComponent airConditioner = new AirConditioner();
        SmartComponent smartLight1 = new SmartLight();
        SmartComponent smartLight2 = new SmartLight();

        CompositeSmartComponent room1 = new CompositeSmartComponent();
        room1.addComponents(airConditioner);
        room1.addComponents(smartLight1);

        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room1.addComponents(smartLight2);

        CompositeSmartComponent floor = new CompositeSmartComponent();
        floor.addComponents(room1);
        floor.addComponents(room2);

        CompositeSmartComponent house = new CompositeSmartComponent();
        house.addComponents(floor);

        house.turnOff();

    }
}
