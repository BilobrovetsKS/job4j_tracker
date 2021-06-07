package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
         System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println(passengers);
    }

    @Override
    public double filling(double fuel) {
        double price95 = 48.50;
        double cost = price95 * fuel;
        return cost;
    }
}
