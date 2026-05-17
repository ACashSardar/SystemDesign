package LLD.Applications.SnakeAndFoodGame;

// Controls the game flow, processes moves, and tracks the score.
public class SnakeGame {
    private GameBoard board;
    private Snake snake;
    private int[][] food;
    private int foodIndex;
    private MovementStrategy movementStrategy;

    // Game initialization and movement logic
    // Initialize the game with specified dimensions and food positions.
    public SnakeGame(int width, int height, int[][] food) {
        this.board = GameBoard.getInstance(width, height);
        this.food = food;
        this.foodIndex = 0;

        // Initialize snake
        this.snake = new Snake();

        // Set default movement strategy
        this.movementStrategy = new HumanMovementStrategy();
    }

    // Set the movement strategy (Human or AI)
    public void setMovementStrategy(MovementStrategy strategy) {
        this.movementStrategy = strategy;
    }

    // Returns the new score or -1 if game over.
    public int move(String direction) {
        // Get current head
        Pair currentHead = this.snake.body.peekFirst();

        // Get next position using strategy pattern
        Pair newHead = this.movementStrategy.getNextPosition(currentHead, direction);
        int newHeadRow = newHead.getRow();
        int newHeadColumn = newHead.getCol();
        // Check boundary conditions
        boolean crossesBoundary = (newHeadRow < 0 || newHeadRow >= this.board.getHeight()) ||
                (newHeadColumn < 0 || newHeadColumn >= this.board.getWidth());

        // Get current tail for collision check
        Pair currentTail = this.snake.body.peekLast();

        // Check if snake bites itself (excluding tail which will move away)
        boolean bitesItself = this.snake.positionMap.containsKey(newHead) &&
                !(newHead.getCol() == currentTail.getCol() &&
                        newHead.getRow() == currentTail.getRow());

        // Game over conditions
        if (crossesBoundary || bitesItself) {
            return -1;
        }
        // Check if snake eats food
        boolean ateFood = (this.foodIndex < this.food.length) &&
                (this.food[this.foodIndex][0] == newHeadRow) &&
                (this.food[this.foodIndex][1] == newHeadColumn);
        if (ateFood) {
            // Increment food index to move to next food
            this.foodIndex++;
        } else {
            // If no food eaten, remove tail
            this.snake.body.pollLast();
            this.snake.positionMap.remove(currentTail);
        }
        // Add new head
        this.snake.body.addFirst(newHead);
        this.snake.positionMap.put(newHead, true);
        // Calculate ans return score
        int score = this.snake.body.size() - 1;
        return score;
    }
}
