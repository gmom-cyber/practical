package ru.mirea.exercise14and15.zadacha1;

public class RightLeg extends Thread {

    private Control res;
    private int battery;
    public RightLeg(Control res, int battery) {
        this.res = res;
        this.battery = battery;
    }

    public void run() {
        synchronized (res) {
            for (int i = 0; i <= battery; i++) {
                System.out.println("Right");
                res.controlOfSpeed();
            }

        }

    }
}