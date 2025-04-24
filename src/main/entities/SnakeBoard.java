package main.entities;

public class SnakeBoard {

    private final int width;

    private final int height;

    private final Snake snake;

    private final Food food;

    private static volatile SnakeBoard snakeBoardInstance;

    private SnakeBoard(int width, int height) {
        this.width = width;
        this.height = height;
        snake = new Snake();
        food = new Food();
    }

    public static SnakeBoard getSnakeBoardInstance(int width, int height) {
        if(snakeBoardInstance==null) {
            synchronized (SnakeBoard.class) {
                if(snakeBoardInstance==null) {
                    snakeBoardInstance = new SnakeBoard(width, height);
                }
            }
        }
        return snakeBoardInstance;
    }

    public Snake getSnake() {
        return snake;
    }

    private boolean isGameOver(Cell cell){
        return checkCollidingWithBoundary(cell) || checkCollidesWithItself(cell);
    }

    private boolean checkCollidesWithItself(Cell cell) {
        return snake.getSnakePositionSet().contains(cell);
    }

    private boolean checkCollidingWithBoundary(Cell cell) {
        return cell.getRow()>=0 && cell.getRow()<height && cell.getCol()>=0 && cell.getCol()<width;
    }

    private boolean cellContainsFood(Cell cell) {
        return !food.getFoodPositions().isEmpty() && cell.equals(food.getFoodPositions().peek());
    }

    public boolean move(int row, int col){
        Cell cell = new Cell(row, col);
        if(isGameOver(cell)){
            return true;
        }
        if(!cellContainsFood(cell)){
            Cell snakesTail = snake.getSnakeDeque().removeLast();
            snake.getSnakePositionSet().remove(snakesTail);
        }
        else{
            if(!food.getFoodPositions().isEmpty()){
                food.getFoodPositions().poll();
            }
        }
        snake.getSnakeDeque().addFirst(cell);
        snake.getSnakePositionSet().add(cell);
        return false;
    }

}
