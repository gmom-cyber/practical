package ru.mirea.exercise21and22.ex2;
import java.util.Scanner;
public class Client {

    //Chair[] vyb = {new VikChair(), new MultiChair(), new MagicChair()};

    public Client() {
        Scanner сhoice = new Scanner(System.in);
        System.out.println("Выберите стул:\n0 - Викторианский стул;\n" +
                "1 - Многофункциональный стул;\n" +
                "2 - Магический стул");
        int ch = сhoice.nextInt();
        switch (ch){
            case 0:
                sit(new VictorianСhair());
                break;
            case 1:
                sit(new MultifunctionalChair());
                break;
            case 2:
                sit(new MagicChair());
                break;
            default:
                System.out.println("Ошибка...");
                break;
        }

    }

    public void sit(Chair chair) {
        chair.sit();
    }
}


