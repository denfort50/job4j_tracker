package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.print("Поезд передвигается по рельсам. ");
    }

    @Override
    public void seat() {
        System.out.println("В поезде имеется 600 мест.");
    }
}
