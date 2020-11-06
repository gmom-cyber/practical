package ru.mirea.exercise15and16.zadacha1;

public class LeftLeg extends Thread {

    private Control res;
    private int battery;
    public LeftLeg(Control res, int battery) {
        this.res = res;
        this.battery = battery;
    }


    public void run() {
        synchronized (res) {
            for (int i = 0; i <= battery; i++) {
                System.out.println("Left");
                res.controlOfSpeed();
            }

        }
    }
}