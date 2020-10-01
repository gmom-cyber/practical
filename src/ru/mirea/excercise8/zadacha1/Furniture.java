package ru.mirea.excercise8.zadacha1;

public abstract class  Furniture {
   private String name;
   private int price;
   public String getName() { return name; }

    public int getPrice() {
        return price;
    }

    public Furniture(String name, int price){
        this.name=name;
        this.price = price;
    }
    public void sell(){}
}
