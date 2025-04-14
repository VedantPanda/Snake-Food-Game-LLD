package main.command;

import main.entities.SnakeBoard;
import main.strategy.command.Command;

public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public boolean executeCommand(SnakeBoard snakeBoard){
        return command.execute(snakeBoard);
    }

}
