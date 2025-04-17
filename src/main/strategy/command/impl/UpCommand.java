package main.strategy.command.impl;

import main.entities.SnakeBoard;
import main.strategy.command.Command;

public class UpCommand implements Command {
    @Override
    public boolean execute(SnakeBoard snakeBoard) {
        int row = snakeBoard.getSnake().getSnakeDeque().getFirst().getRow();
        int col = snakeBoard.getSnake().getSnakeDeque().getFirst().getCol();
        return snakeBoard.move(row-1, col);
    }
}
