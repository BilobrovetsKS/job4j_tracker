package ru.job4j.oop;

public class Plane implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " air");
    }

    @Override
    public void speed() {
        int maxSpeed = 580;
        System.out.println(getClass().getSimpleName() + " " + "maxSpeed: " + maxSpeed);
    }
}
