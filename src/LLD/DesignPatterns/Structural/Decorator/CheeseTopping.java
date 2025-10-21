package LLD.DesignPatterns.Structural.Decorator;

public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription() + " + Extra Cheese";
    }

    @Override
    public int getCost() {
        return super.pizza.getCost() + 20;
    }
}
