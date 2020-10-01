package ru.mirea.excercise7;

public class ChihyaHya extends Dog{
    private int number_of_paws;
    private String name, total_size;

    public ChihyaHya(int number_of_paws, String name) {
        this.number_of_paws = number_of_paws;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ChihyaHya{" +
                "number_of_paws=" + number_of_paws +
                ", name='" + name + '\'' +
                ", total_size='" + total_size + '\'' +
                '}';
    }

    @Override////Задаем размер экземпляру класса ChihyaHya
    public void size_of_dog() {
        this.total_size = "SMALL";
    }
}
