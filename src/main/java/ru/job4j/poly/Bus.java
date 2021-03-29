package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void passenger(int amount) {
        System.out.println("В этом виде транспорта находятся " + amount + " человек.");
    }

    @Override
    public int refuel(int petrol) {
        int price = 40;
        return petrol * price;
    }
}