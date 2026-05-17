package LLD.Applications.SnakeAndFoodGame;

public class FoodFactory {
    // Static method to create a food item at a given position and type
    public static FoodItem createFood(int[] position, String type) {
        FoodItem foodItem;
        if ("bonus".equals(type)) {
            foodItem = new BonusFood(position[0], position[1]); // Create bonus food
        } else {
            foodItem = new NormalFood(position[0], position[1]); // Default to normal food
        }
        return foodItem;
    }
}
