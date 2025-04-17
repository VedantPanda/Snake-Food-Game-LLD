package main.entities;

import java.util.LinkedList;
import java.util.Queue;

public class Food {

    private final Queue<Cell> foodPositions;

    public Food() {
        foodPositions = new LinkedList<>();
        foodPositions.add(new Cell(1,1));
        foodPositions.add(new Cell(2, 2));
        foodPositions.add(new Cell(3, 3));
        foodPositions.add(new Cell(4, 4));
    }

    public Queue<Cell> getFoodPositions() {
        return foodPositions;
    }
}
