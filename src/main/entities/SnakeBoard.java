package main.entities;

public class SnakeBoard {

    private final int size;

    private int gameScore;

//    private final SnakeFoodVO[][] board;

    public SnakeBoard(int size) {
        this.size = size;
//        board = new SnakeFoodVO[size][size];
        gameScore = 0;
    }

    public boolean isGameOver(){
        return true;
    }

    public boolean move(){
        if(isGameOver()){
            return true;
        }
        //update stuff
        return false;
    }

}
