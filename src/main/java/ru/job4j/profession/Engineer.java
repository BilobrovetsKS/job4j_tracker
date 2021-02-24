package ru.job4j.profession;

public class Engineer extends Profession{

    private String qualification; // квалификация сотрудника

    private int project; // кол-во сделаных проектов

    public Engineer(String name, String surname, String education, String birthday,
                    String qualification, int project) {
        super(name, surname, education, birthday);
        this.project = project;
        this.qualification = qualification;

    }

    public String getQualification (){
        return qualification;
    }

    public int getProject () {

        return project;
    }
}
