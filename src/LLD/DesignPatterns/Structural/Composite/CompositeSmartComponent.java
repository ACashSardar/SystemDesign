package LLD.DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent {
    List<SmartComponent> smartComponents = new ArrayList<>();
    
    void addComponents(SmartComponent component) {
        smartComponents.add(component);
    }

    void removeComponents(SmartComponent component) {
        smartComponents.remove(component);
    }

    @Override
    public void turnOn() {
        for (SmartComponent component : smartComponents) {
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for (SmartComponent component : smartComponents) {
            component.turnOff();
        }
    }
}
