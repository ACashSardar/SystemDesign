package LLD.DesignPatterns.Structural.Decorator;

public class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription() + " + Mushroom";
    }

    @Override
    public int getCost() {
        return super.pizza.getCost() + 40;
    }
}
