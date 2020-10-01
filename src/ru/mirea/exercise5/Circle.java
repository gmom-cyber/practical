package ru.mirea.exercise5;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }// эти методы нужны для реализации интерфейса
    public void move_x(int x){//метод который двигает координату Х
        center.setX(center.getX() + x);
    }
    public void move_y(int y){//метод который двигает координату У
        center.setY(center.getX() + y);
    }
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
