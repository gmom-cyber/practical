package ru.mirea.excercise6;

public class Rectangle {
    private Point center;
    private int diaganal;

    public Rectangle(Point center, int diaganal) {
        this.center = center;
        this.diaganal = diaganal;
    }
    //Getters

    public Point getCenter() {
        return center;
    }

    public int getDiaganal() {
        return diaganal;
    }
    //Setters

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setDiaganal(int diaganal) {
        this.diaganal = diaganal;
    }// эти методы нужны для реализации интерфейса
    public void move_X(int x) {//метод который двигает координату Х}
        center.setX(center.getX() + x);
    }
    public void move_Y(int y) {//метод который двигает координату У
        center.setY(center.getY() + y);
    }
        @Override
    public String toString() {
        return "Rectangle{" +
                "center=" + center +
                ", diaganal=" + diaganal +
                '}';
    }
}
