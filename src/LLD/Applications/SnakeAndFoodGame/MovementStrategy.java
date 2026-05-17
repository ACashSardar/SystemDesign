package LLD.Applications.SnakeAndFoodGame;

// Movement strategy interface
interface MovementStrategy {
    Pair getNextPosition(Pair currentHead, String direction);
}