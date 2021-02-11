package ru.job4j.profession;

public class Surgeon extends Doctor {

    private int operation; // кол-во операций проведенных пациентам

    private String type; // тип операций

    public int getOperation(){
        return operation;
    }

    public String getType() {
        return type;
    }
}
