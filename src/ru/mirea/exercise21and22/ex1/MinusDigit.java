package ru.mirea.exercise21and22.ex1;

public class MinusDigit implements ComplexInterface {
    @Override
    public void start() {
        System.out.println("Новое комплексное число: z = " + randDigit() + " - " + randDigit() + "i");
    }

    public int randDigit()
    {
        return (int)(Math.random()*10);
    }
}

