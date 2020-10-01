package ru.mirea.excercise8.zadacha1;

import java.util.Scanner;
public class FurnitureShop {
    public void main(){
        System.out.println("Добрый день! Вас приветствует магазин мебели IKEA-konch");
        System.out.println("Выберите мебель: \n 1) Стул \n 2) Стол \n 3) Диван");
        //Создаем экземпляры классов
        Furniture table1 = new Table("Инглу",1799,70, "Белый");
        Furniture chair1 = new Chair("Стефан",1999,60, "Белый");
        Furniture sofa1 = new Sofa("Верона", 14599,"Хлопок", 234);
        //Создаем объект console  для ввода с клавиатуры
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();

        int b;

        switch (a) {
            case (1):
                System.out.println("Информация о стуле: \n" + chair1);
                System.out.println("Будете брать? 1)Да 2) Нет");
                b = console.nextInt();
                if (b == 1)
                    chair1.sell();
                break;
            case (2):
                System.out.println("Информация о столе: \n" + table1);
                System.out.println("Будете брать? 1)Да 2) Нет");
                b = console.nextInt();
                if (b == 1)
                    table1.sell();
                break;
            case (3):
                System.out.println("Информация о диване: \n" + sofa1);
                System.out.println("Будете брать? 1)Да 2) Нет");
                b = console.nextInt();
                if (b == 1)
                    table1.sell();
                break;
        }

    }
}
