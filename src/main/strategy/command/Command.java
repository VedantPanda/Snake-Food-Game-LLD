package main.strategy.command;

import main.entities.SnakeBoard;

public interface Command {
    boolean execute(SnakeBoard snakeBoard);
}
