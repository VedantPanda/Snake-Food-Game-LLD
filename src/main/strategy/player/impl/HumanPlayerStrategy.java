package main.strategy.player.impl;

import main.factory.CommandFactory;
import main.strategy.command.Command;
import main.strategy.player.PlayerStrategy;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {

    private final Scanner scanner;

    public HumanPlayerStrategy() {
        scanner = new Scanner(System.in);
    }

    @Override
    public Command play() {
        while (true){
            System.out.println("Enter Direction");
            String direction = scanner.nextLine();
            Command command = CommandFactory.getCommand(direction);
            if(command==null){
                System.out.println("Invalid Direction...try again");
                continue;
            }
            return command;
        }
    }

}
