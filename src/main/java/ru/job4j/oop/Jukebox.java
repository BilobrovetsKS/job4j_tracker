package ru.job4j.oop;

public class Jukebox {
    public void music(int position){
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else {
            if (position == 2) {
                System.out.println("Спокойной ночи");
            } else {
                System.out.println("Песня не найдена");
            }
        }
    }

    public static void main(String[] args) {
       Jukebox choice = new Jukebox();
        int first = 1;
        int second = 2;
        int enough = 3;
        choice.music(first);
        choice.music(second);
        choice.music(enough);
    }
}
