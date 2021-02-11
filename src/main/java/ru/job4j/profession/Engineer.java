package ru.job4j.profession;

public class Engineer extends Profession{

    private String qualification; // квалификация сотрудника

    private int project; // кол-во сделаных проектов

    public String getQualification (){
        return qualification;
    }

    public int getProject () {
        return project;
    }
}
