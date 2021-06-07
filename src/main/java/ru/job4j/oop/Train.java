package ru.job4j.oop;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " rails");
    }

    @Override
    public void speed() {
        int maxSpeed = 90;
        System.out.println(getClass().getSimpleName() + " " + "maxSpeed: " + maxSpeed);
    }
}
