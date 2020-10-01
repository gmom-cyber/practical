package ru.mirea.excercise8.zadacha2;

public class Square extends Rectangle {
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled,0,0);
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String  toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
