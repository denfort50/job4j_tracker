package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("Application");
        tracker.add(item);
        String result = tracker.findById(1).getName();
        System.out.println(result);
    }
}
