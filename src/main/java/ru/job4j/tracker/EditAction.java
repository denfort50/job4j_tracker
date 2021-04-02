package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Edit the Item ====");
        int id = input.askInt("Enter ID: ");
        String name = input.askStr("Enter name: ");
        Item newItem = new Item(name);
        boolean rsl = tracker.replace(id, newItem);
        if (rsl) {
            System.out.println("The operation was completed successfully.");
        } else {
            System.out.println("The operation cannot be completed.");
        }
        return true;
    }
}
