package ru.job4j.tracker;

public interface Transport {
    String drive();

    int passenger(int amount);

    int refuel(int petrol);
}
