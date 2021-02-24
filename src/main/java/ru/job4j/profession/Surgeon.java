package ru.job4j.profession;

public class Surgeon extends Doctor {

    private int operation; // кол-во операций проведенных пациентам

    private String type; // тип операций

    public Surgeon(String name, String surname, String education, String birthday,
                   String specialization, int patients, String diagnosis, int operation, String type) {
        super(name, surname, education, birthday, specialization, patients, diagnosis);
        this.operation = operation;
        this.type = type;
    }

    public int getOperation(){
        return operation;
    }

    public String getType() {
        return type;
    }
}
