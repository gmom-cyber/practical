package ru.mirea.exercise17and18;

public class Zadacha1 {
    public void zadachka1()
    {
        String input = "abcdefghijklmnopqrstuv18340";
        System.out.println(input);
        boolean result = input.matches("abcdefghijklmnopqrstuv18340");
        if (result) {
            System.out.println("Данная строка является строкой \"abcdefghijklmnopqrstuv18340\"\n");
        } else {
            System.out.println("Данная строка НЕ является строкой \"abcdefghijklmnopqrstuv18340\"\n");
        }
    }
}
