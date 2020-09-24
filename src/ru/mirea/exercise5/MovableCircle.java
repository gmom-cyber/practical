package ru.mirea.exercise5;

public class MovableCircle extends Circle implements Movable {


    public MovableCircle(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y) {
        move_x(x);
        move_y(y);
    }
}
