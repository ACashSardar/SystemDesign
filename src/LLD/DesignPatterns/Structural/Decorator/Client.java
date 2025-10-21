package LLD.DesignPatterns.Structural.Decorator;

public class Client {
    public static void main(String[] args) {

        // Creating a Plain pizza
        BasePizza pizza = new Plain();
        System.out.println(pizza.getDescription() + " " + pizza.getCost());

        // Adding toppings to the Plain Pizza - Extra Cheese
        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getDescription() + " " + pizza.getCost());

        // Adding toppings again - Mushroom topping
        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.getDescription() + " " + pizza.getCost());
    }
}
