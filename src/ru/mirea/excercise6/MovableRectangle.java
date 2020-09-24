package ru.mirea.excercise6;

public class MovableRectangle extends Rectangle implements Movable {

    public MovableRectangle(Point center, int diaganal) {
        super(center, diaganal);
    }

    @Override
    public void move(int x, int y) {
        move_X(x);
        move_Y(y);
    }
}
