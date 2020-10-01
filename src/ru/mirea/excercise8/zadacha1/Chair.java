package ru.mirea.excercise8.zadacha1;

public class Chair extends Furniture {
    private int height_in_cm;
    private String color;

    public Chair(String name, int price, int height_in_cm, String color) {
        super(name, price);
        this.color = color;
        this.height_in_cm = height_in_cm;
    }

    public int getHeight_in_cm() {
        return height_in_cm;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "\n" +
                "Название:"+super.getName()+", Высота: "+ height_in_cm +
                ", Цвет: " + color+ ", Цена: "+super.getPrice()+" р.";
    }
    @Override
    public void sell() {
        System.out.println("Мебель: "+super.getName()+" \t Высота: "+height_in_cm+" \t Цвет:"+color+" \n Результат: ПРОДАНО");
    }
}
