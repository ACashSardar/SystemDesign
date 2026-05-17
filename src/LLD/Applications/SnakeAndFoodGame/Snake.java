package LLD.Applications.SnakeAndFoodGame;

import java.util.*;

// Represents the snake, which consists of a list of body segments and moves in a given direction.
public class Snake {
    public Deque<Pair> body; // Snake body as a deque of positions
    public Map<Pair, Boolean> positionMap; // For O(1) collision check

    public Snake() {
        this.body = new LinkedList<>();
        this.positionMap = new HashMap<>();
    }

    // Methods for movement, growth, collision detection
}