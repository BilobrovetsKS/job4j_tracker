package ru.job4j.profession;

public class Programmer extends Engineer{

    private String language; // тип языка который знает программист

    private int hours; // кол-во часов работы в день

    public String getLanguage() {
    return language;
    }

    public int getHours() {

        return hours;
    }
}