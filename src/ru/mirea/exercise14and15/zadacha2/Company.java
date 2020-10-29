package ru.mirea.exercise14and15.zadacha2;

public class Company {
    private String name;
    private int money;

    public Company(String name, int money) {
        this.name = name;
        this.money = money;
        System.out.println("Открыт новый счёт. Комрания: " + name + " на счету: " + money + " руб.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Произошла авторизация " + Thread.currentThread().getName() + " автомата");
        System.out.println("Старое наименование: " + this.name);
        this.name = name;
        System.out.println("Новое наименование: " + this.name);
        control();
    }

    public int getWallet() {
        return money;
    }

    public void setWallet(int money) {
        System.out.println("Произошла авторизация " + Thread.currentThread().getName() + " автомата");
        System.out.println("Процесс обновления суммы кошелька. Старая сумма: " + this.money + " руб.");
        this.money = money;
        System.out.println("Процесс успешно завершён. Новая сумма: " + money + " руб.");
        control();
    }

    public void setMoneytm(int money) {//Снятие денег
        System.out.println();
        System.out.println("Произошла авторизация " + Thread.currentThread().getName() + " автомата");
        System.out.println("Запрос на снятие " + money + " руб. На счету: " + this.money + " руб.");
        if(money > this.money)
        {
            System.out.println("Процесс успешно провален.");
            control();
            return;
        }
        this.money -= money;
        System.out.println("Процесс успешно завершён. Новая сумма: " + this.money + " руб.");
        control();
    }

    public void setMoneytp(int money) {//Пополнение
        System.out.println();
        System.out.println("Произошла авторизация " + Thread.currentThread().getName() + " автомата");
        System.out.println("Запрос на пополнение " + money + " руб. На счету: " + this.money + " руб.");
        this.money += money;
        System.out.println("Процесс успешно завершён. Новая сумма: " + this.money + " руб.");
        control();
    }

    public void control()
    {
        notifyAll();
        try {
            wait();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
