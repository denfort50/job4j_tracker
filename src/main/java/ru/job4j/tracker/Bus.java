package ru.job4j.tracker;

public class Bus implements Transport {

    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passenger(int amount) {
        return 0;
    }

    @Override
    public int refuel(int petrol) {
        int price = 40;
        return price * petrol;
    }
}
