package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String speciality;

    public Surgeon(String name, String surname, String education, String birthday,
                   String speciality, String internship) {
        super(name, surname, education, birthday, internship);
        this.speciality = speciality;
    }

    public Instrument use(Diagnosis diagnosis) {
        return new Instrument();
    }
}