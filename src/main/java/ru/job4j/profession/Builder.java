package ru.job4j.profession;

public class Builder extends Engineer {

    private String program; // программа в которой работает строитель

    private String typeBuilding; // Тип проектируемых зданий;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getProgram() {
        return program;
    }

    public String getTypeBuilding() {
        return typeBuilding;
    }
}
