package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.print("Самолет летит по воздуху. ");
    }

    @Override
    public void seat() {
        System.out.println("В самолете имеется 300 мест.");
    }
}
