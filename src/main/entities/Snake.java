package main.entities;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Snake {

    private final Deque<Cell> snakeDeque;

    private final Set<Cell> snakePositionSet;

    public Snake() {
        snakeDeque = new LinkedList<>();
        snakeDeque.addFirst(new Cell(0, 0));
        snakePositionSet = new HashSet<>();
        snakePositionSet.add(new Cell(0, 0));
    }

    public Deque<Cell> getSnakeDeque() {
        return snakeDeque;
    }

    public Set<Cell> getSnakePositionSet() {
        return snakePositionSet;
    }
}
