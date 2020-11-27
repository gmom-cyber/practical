package ru.mirea.exercise21and22.ex2;

public class MultifunctionalChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Вы сели на многофункциональный стул. Вау!");
    }
}
