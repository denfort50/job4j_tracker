package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Kalchenko Denis Alexandrovich");
        student.setGroup("E-531");
        student.setEntered("01.09.2017");
        System.out.println(student.getFio() + System.lineSeparator() + "Group: "
                + student.getGroup() + System.lineSeparator() + "Date: " + student.getEntered());
    }
}
