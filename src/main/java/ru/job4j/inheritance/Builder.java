package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String building;

    public Builder(String name, String surname, String education, String birthday, String experience, String building) {
        super(name, surname, education, birthday, experience);
        this.building = building;
    }

    public City removal(Salary salary) {
        return new City();
    }
}
