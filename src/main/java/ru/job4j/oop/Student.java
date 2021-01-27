package ru.job4j.oop;

public class Student {

    public static void music() {
        System.out.println("Tra tra tra");
    }

    public static void song() {
        System.out.println("I believe i can fly, I believe i can touch the sky");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i = 0; i < 3; i++) {
            petya.music();
        }
        for (int i = 0; i < 3; i++) {
            petya.song();
        }
    }
}
