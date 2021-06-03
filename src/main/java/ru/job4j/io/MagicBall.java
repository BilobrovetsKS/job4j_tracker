package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Приветсвую тебя, я Ванга. Что ты хочешь узнать?");
        String questions = input.nextLine();
        int answer = new Random().nextInt(3);
        String option;
        switch (answer) {
            case 0 :
                option = "Да";
                break;
            case 1 :
                option = "Нет";
                break;
            default :
                option = "Может быть";
                break;
        }
        System.out.println(option);
    }
}
