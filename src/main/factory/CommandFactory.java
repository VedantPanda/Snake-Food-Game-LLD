package main.factory;

import main.consts.Direction;
import main.strategy.command.Command;
import main.strategy.command.impl.DownCommand;
import main.strategy.command.impl.LeftCommand;
import main.strategy.command.impl.RightCommand;
import main.strategy.command.impl.UpCommand;

public class CommandFactory {

    public static Command getCommand(String command){
        if(Direction.UP.toString().equalsIgnoreCase(command)){
            return new UpCommand();
        }
        else if(Direction.DOWN.toString().equalsIgnoreCase(command)){
            return new DownCommand();
        }
        else if(Direction.LEFT.toString().equalsIgnoreCase(command)){
            return new LeftCommand();
        }
        else if(Direction.RIGHT.toString().equalsIgnoreCase(command)){
            return new RightCommand();
        }
        else{
            return null;
        }
    }

}
