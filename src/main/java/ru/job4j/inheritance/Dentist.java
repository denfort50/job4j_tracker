package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String clinic;

    public Dentist(String name, String surname, String education,
                   String birthday, String clinic, String internship) {
        super(name, surname, education, birthday, internship);
        this.clinic = clinic;
    }

    public Tooth pullOut(Diagnosis diagnosis) {
        return new Tooth();
    }
}
