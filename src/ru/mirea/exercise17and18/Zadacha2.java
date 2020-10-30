package ru.mirea.exercise17and18;

public class Zadacha2 {
    public void zadachka2()
    {
        String input = "01:23:45:67:89:Az";
        System.out.println(input);
        boolean result = input.matches("(([0-9A-Fa-f]{2}[-:]){5}[0-9A-Fa-f]{2})|(([0-9A-Fa-f]{4}\\.){2}[0-9A-Fa-f]{4})");
        if (result) {
            System.out.println("Данная строка является MAC-адресом\n");
        } else {
            System.out.println("Данная строка НЕ является MAC-адресом\n");
        }
    }
}
