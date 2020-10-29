package ru.mirea.exercise14and15.zadacha1;

public class MyRobot {
    public static void main(String[] args) {
        Control controller = new Control();
        Thread left = new Thread(new LeftLeg(controller, 100));
        left.start();

        Thread right = new Thread(new RightLeg(controller, 100));
        right.start();

    }
}
