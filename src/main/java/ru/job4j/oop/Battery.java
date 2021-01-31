package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int value){
        this.load = value;
    }
    public void exchange(Battery another){
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(100);
        Battery discharge = new Battery(10);
        System.out.println("The value of the battery:" + battery.load + " " + "discharge:" + discharge.load);
        battery.exchange(discharge);
        System.out.println("The value of the battery:" + battery.load + " " + "discharge:" + discharge.load);
    }
}
