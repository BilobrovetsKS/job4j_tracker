package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Иван Иванов Иванович");
        student.setGroup("LB-221");
        student.setDataAdmission("20.08.2020");

        System.out.println("ФИО:" + student.getName() + System.lineSeparator() +
                "Группа:" + student.getGroup() + System.lineSeparator() +
                "Дата поступления:" + student.getDataAdmission());
    }
}
