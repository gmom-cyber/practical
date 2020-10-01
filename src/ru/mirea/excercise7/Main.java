package ru.mirea.excercise7;

public class Main {
    public void main(){
        /*
        Dish plate = new Plate(1,10);

        Dish pan = new Pan(20,100);

        plate.calcVolume();
        ((Pan)pan).makeBorsh();
        */
        Dog bobik = new Husky(4, "БОБИК");
        bobik.size_of_dog();
        System.out.println(bobik);

        Dog chip = new ChihyaHya(4, "ЧИП");
        chip.size_of_dog();
        System.out.println(chip);

    }
}