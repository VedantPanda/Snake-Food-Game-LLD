package main.entities;

import main.BoardGames;
import main.factory.PlayerStrategyFactory;

public class SnakeGame implements BoardGames {

    private final Player player;

    public SnakeGame() {
        player = new Player("Alex", PlayerStrategyFactory.getPlayerStrategy("Human"));
    }

    @Override
    public void playBoardGame() {
        player.getPlayerStrategy().play();
    }

}
