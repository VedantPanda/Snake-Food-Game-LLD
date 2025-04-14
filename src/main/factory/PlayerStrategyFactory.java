package main.factory;

import main.strategy.player.PlayerStrategy;
import main.strategy.player.impl.HumanPlayerStrategy;

public class PlayerStrategyFactory {

    public static PlayerStrategy getPlayerStrategy(String strategy){
        if("Human".equalsIgnoreCase(strategy)){
            return new HumanPlayerStrategy();
        }
        else {
            return null;
        }
    }

}
