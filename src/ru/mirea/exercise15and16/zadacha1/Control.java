package ru.mirea.exercise15and16.zadacha1;

public class Control {


        public void controlOfSpeed() {
            notify();
            try {
                wait();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
