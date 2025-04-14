package main.vo;

import main.entities.Food;
import main.entities.Snake;

public class SnakeFoodVO {

    private final Food food;

    private final Snake snake;

    public SnakeFoodVO(Food food, Snake snake) {
        this.food = food;
        this.snake = snake;
    }

    public Food getFood() {
        return food;
    }

    public Snake getSnake() {
        return snake;
    }
}
