package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.print("Автобус двигается по скоростным трассам. ");
    }

    @Override
    public void seat() {
        System.out.println("В автобусе имеется 40 мест.");
    }
}
