package ru.mirea.exercise14and15.zadacha2;


public class Bank {
    public static void main(String[] args) {
        Company company = new Company("ВТБ", 50000);
        /*new Thread(new ATM1(company), "с первого").start();
        new Thread(new ATM2(company), "со второго").start();
        new Thread(new ATM3(company), "с третьего").start();

         */
        Thread atm1 = new Thread(new ATM1(company), "с первого");
        Thread atm2 = new Thread(new ATM2(company), "со второго");
        Thread atm3 = new Thread(new ATM3(company), "с третьего");

        atm1.start();
        atm2.start();
        atm3.start();
    }
}
