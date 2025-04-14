package main.strategy.command.impl;

import main.entities.SnakeBoard;
import main.strategy.command.Command;

public class RightCommand implements Command {
    @Override
    public boolean execute(SnakeBoard snakeBoard) {
        //based on the head of the snake if we go down i.e. row, col+1
        //validate if row, col+1 is making the game over if yes return true
        //else update the head of the snake to the new row and col
        //if food is there eat it and update the length of the snake and score of the game
        //spawn the next food and whatever place decided and return false;
        return snakeBoard.move();
    }
}
