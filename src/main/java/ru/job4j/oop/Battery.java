package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int value){
        this.load = value;
    }
    public void exchange(Battery another){
        this.load = this.load - another.load;
        this.load = Math.abs(this.load);
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery discharge = new Battery(30);
        Battery battery2 = new Battery(0);
        System.out.println("battery1:" + battery1.load + " " + "discharge:" + discharge.load + " " + "battery2:" + battery2.load);
        battery1.exchange(discharge);
        battery2.exchange(discharge);
        System.out.println("battery1:" + battery1.load + " " + "discharge:" + discharge.load + " " + "battery2:" + battery2.load);
    }
}
