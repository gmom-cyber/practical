package ru.mirea.excercise8.zadacha1;

import ru.mirea.excercise8.zadacha1.Furniture;

public class Table extends Furniture {
    private int height_in_cm;
    private String color;

    public int getHeight_in_cm() {
        return height_in_cm;
    }

    public String getColor() {
        return color;
    }

    public void setHeight_in_cm(int height_in_cm) {
        this.height_in_cm = height_in_cm;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Table(String name, int price, int height_in_cm,String color )
    {
        super(name, price);
        this.color = color;
        this.height_in_cm = height_in_cm;
    }

    @Override
    public String toString() {
        return "Стол:\n" +
                "Название:"+super.getName()+", Высота: "+ height_in_cm +
                ", Цвет: " + color+ ", Цена: "+super.getPrice()+" р.";
    }

    @Override
    public void sell() {
        System.out.println("Мебель: "+super.getName()+" \t Высота: "+height_in_cm+" \t Цвет: "+color+"\n Результат: ПРОДАНО");
    }
}
