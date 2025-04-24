package main.entities;

import main.BoardGames;
import main.command.Invoker;
import main.factory.PlayerStrategyFactory;
import main.strategy.command.Command;

public class SnakeGame implements BoardGames {

    private final Player player;

    private final Invoker invoker;

    private final SnakeBoard snakeBoard;

    public SnakeGame() {
        player = new Player("Alex", PlayerStrategyFactory.getPlayerStrategy("Human"));
        snakeBoard = SnakeBoard.getSnakeBoardInstance(5, 5);
        invoker = new Invoker();
    }

    @Override
    public void playBoardGame() {
        do {
            Command command = player.getPlayerStrategy().play();
            invoker.setCommand(command);
        } while (!invoker.executeCommand(snakeBoard));
        announceResult();
    }

    private void announceResult() {
        int score = snakeBoard.getSnake().getSnakeDeque().size()-1;
        System.out.println("Your final score is "+score);
    }

}
