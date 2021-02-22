package ru.job4j.profession;

public class Doctor extends Profession {

    private String specialization; // специализация врача

    private int patients; // кол - во пациентов

    private String diagnosis; // диагнозы пациентов

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }


    public String getSpecialization() {
    return specialization;
    }

    public int getPatients() {
        return patients;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
