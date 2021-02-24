package ru.job4j.profession;

public class Builder extends Engineer {

    private String program; // программа в которой работает строитель

    private String typeBuilding; // Тип проектируемых зданий;

    public Builder(String name, String surname, String education, String birthday,
                   String qualification, int project, String program, String typeBuilding) {
        super(name, surname, education, birthday, qualification, project);
        this.program = program;
        this.typeBuilding = typeBuilding;
    }

    public String getProgram() {
        return program;
    }

    public String getTypeBuilding() {
        return typeBuilding;
    }
}
