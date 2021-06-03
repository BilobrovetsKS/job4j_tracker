package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println("На столе " + count + " спичек" + " ходит: " + player);
            System.out.println(player + " ,Вы можете выбрать от 1 - 3 спичек");
            int matchers = Integer.parseInt(input.nextLine());
            while (matchers <= 0 || matchers > 3) {
                System.out.println("Выберите число от 1-3");
                matchers = Integer.parseInt(input.nextLine());
            }
            turn = !turn;
            count = count - matchers;
        }

        if (!turn) {
            System.out.println("Выйграл первый игрок");
        } else {
            System.out.println("Выйграл второй игрок");
        }
    }
}
