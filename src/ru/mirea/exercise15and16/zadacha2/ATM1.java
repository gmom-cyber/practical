package ru.mirea.exercise15and16.zadacha2;
import java.util.Random;
public class ATM1 implements Runnable {

    private final Company res;

    public ATM1(Company res) {
        this.res = res;
    }

    @Override
    public void run() {
        Random random = new Random();
        boolean plusOrMinus = random.nextBoolean();
        synchronized (res) {
            while (true) {
                if (plusOrMinus) {
                    res.setMoneytm((int) (Math.random() * 100000));
                } else if (!(plusOrMinus)) {
                    res.setMoneytp((int) (Math.random() * 1000));
                }
            }
        }
    }
}
