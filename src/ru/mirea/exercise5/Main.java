package ru.mirea.exercise5;

public class Main {

    public void main() {



        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);


        Circle circle = new Circle(new Point(1,1), 10f);

        System.out.println(circle);

        MovableCircle movableCircle1 = new MovableCircle(new Point (1,1), 10f);
        movableCircle1.move(32,44);
        System.out.println(movableCircle1);

    }
}
