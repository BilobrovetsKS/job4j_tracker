package ru.job4j.oop;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " road");
    }

    @Override
    public void speed() {
        int maxSpeed = 120;
        System.out.println(getClass().getSimpleName() + " " + "maxSpeed: " + maxSpeed);
    }
}
