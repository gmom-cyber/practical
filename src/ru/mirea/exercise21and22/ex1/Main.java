package ru.mirea.exercise21and22.ex1;
import ru.mirea.exercise21and22.ex1.ComplexInterface;
import ru.mirea.exercise21and22.ex1.Action;
public class Main {
    public static void main(String[] args) {

        Init init = new Init();
        ComplexInterface comp = init.getRandomComplex();
            comp.start();

    }
}
