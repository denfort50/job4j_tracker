package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String description) {
        this.desc = description;
    }

    public static void main(String[] args) {
        String word = "Check";
        Fix var = new Fix(word);
    }
}
