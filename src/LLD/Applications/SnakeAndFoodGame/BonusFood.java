package LLD.Applications.SnakeAndFoodGame;

public class BonusFood extends FoodItem {
    public BonusFood(int row, int column) {
        super(row, column);
        this.points = 3; // Assign higher point value than normal
    }
}
