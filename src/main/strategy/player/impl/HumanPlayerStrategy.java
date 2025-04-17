package main.strategy.player.impl;

import main.command.Invoker;
import main.entities.SnakeBoard;
import main.factory.CommandFactory;
import main.strategy.command.Command;
import main.strategy.player.PlayerStrategy;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {

    private final Scanner scanner;

    private final Invoker invoker;

    private final SnakeBoard snakeBoard;

    public HumanPlayerStrategy() {
        snakeBoard = new SnakeBoard(5, 5);
        invoker = new Invoker();
        scanner = new Scanner(System.in);
    }

    @Override
    public void play() {
        while (true){
            System.out.println("Enter Direction");
            String direction = scanner.nextLine();
            Command command = CommandFactory.getCommand(direction);
            if(command==null){
                System.out.println("Invalid Direction...try again");
                continue;
            }
            invoker.setCommand(command);
            if(invoker.executeCommand(snakeBoard)){
                break;
            }
        }
        announceResult();
        scanner.close();
    }

    private void announceResult() {
        int score = snakeBoard.getSnake().getSnakeDeque().size()-1;
        System.out.println("Your final score is "+score);
    }

}
