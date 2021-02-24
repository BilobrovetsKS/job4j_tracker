package ru.job4j.profession;

public class Dentist extends Doctor{

    private int profHygiene; // кол-во проведенных профгигиен

    private int whitening; // кол-во проведенных отбеливаний

    public Dentist(String name, String surname, String education, String birthday, String specialization,
                   int patients, String diagnosis, int profHygiene, int whitening) {
        super(name, surname, education, birthday, specialization, patients, diagnosis);
        this.profHygiene = profHygiene;
        this.whitening = whitening;
    }

    public int getProfHygiene() {
        return profHygiene;
    }

    public int getWhitening() {
        return whitening;
    }
}
