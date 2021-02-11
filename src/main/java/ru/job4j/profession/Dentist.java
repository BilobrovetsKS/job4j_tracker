package ru.job4j.profession;

public class Dentist extends Doctor{

    private int profHygiene; // кол-во проведенных профгигиен

    private int whitening; // кол-во проведенных отбеливаний

    public int getProfHygiene() {
        return profHygiene;
    }

    public int getWhitening() {
        return whitening;
    }
}
