package ru.mirea.excercise7;

public class Husky extends Dog{
    private int number_of_paws;
    private String name, total_size;

    public Husky(int number_of_paws, String name) {
        this.number_of_paws = number_of_paws;
        this.name = name;
    }

    public String getTotal_size() {
        return total_size;
    }

    @Override
    public String toString() {
        return "Husky{" +
                "number_of_paws=" + number_of_paws +
                ", name='" + name + '\'' +
                ", total_size='" + total_size + '\'' +
                '}';
    }

    @Override//Задаем размер экземпляру класса Husky
    public void size_of_dog() {
        this.total_size = "BIG";
    }
}
