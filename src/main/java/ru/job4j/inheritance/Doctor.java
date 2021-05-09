package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String internship;

    public Doctor(String name, String surname, String education, String birthday,
                  String internship) {
        super(name, surname, education, birthday);
        this.internship = internship;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}