package ru.mirea.excercise6;

public class Main {

    public void main() {



        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);


        Rectangle rectangle1 = new Rectangle(new Point(2,2), 10);
        System.out.println(rectangle1);

        MovableRectangle movableRectangle1 = new MovableRectangle(new Point(2,2), 10);
        movableRectangle1.move(12,13);
        System.out.println(movableRectangle1);



    }
}
