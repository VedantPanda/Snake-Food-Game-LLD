package main.entities;

import main.strategy.player.PlayerStrategy;

public class Player {

    private final String name;

    private final PlayerStrategy playerStrategy;

    public Player(String name, PlayerStrategy playerStrategy) {
        this.name = name;
        this.playerStrategy = playerStrategy;
    }

    public String getName() {
        return name;
    }

    public PlayerStrategy getPlayerStrategy() {
        return playerStrategy;
    }
}
