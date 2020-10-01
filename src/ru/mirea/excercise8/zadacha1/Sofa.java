package ru.mirea.excercise8.zadacha1;

import ru.mirea.excercise8.zadacha1.Furniture;

public class Sofa extends Furniture {
    private String material;
    private int width_in_cm;

    public Sofa(String name, int price, String material, int width_in_cm) {
        super(name, price);
        this.material = material;
        this.width_in_cm = width_in_cm;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWidth_in_cm(int width_in_cm) {
        this.width_in_cm = width_in_cm;
    }

    public String getMaterial() {
        return material;
    }

    public int getWidth_in_cm() {
        return width_in_cm;
    }
    @Override
    public void sell() {
        System.out.println("Мебель: "+super.getName()+" \t Ширина: "+width_in_cm+"\t Материал:"+material+" \n Результат: ПРОДАНО");
    }
    @Override
    public String toString() {
        return "Стол:\n" +
                "Название:"+super.getName()+", Ширина: "+ width_in_cm +
                ", Материал: " + material+ ", Цена: "+super.getPrice()+" р.";
    }
}
