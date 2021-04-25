package ru.job4j.tracker;

import java.util.List;

public class FindItemsByNameAction implements UserAction {
    private final Output out;

    public FindItemsByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==== Find items by name ====");
        String name = input.askStr("Enter name: ");
        List<Item> rsl = tracker.findByName(name);
        if (rsl.size() > 0) {
            for (Item item : rsl) {
                out.println(item);
            }
        } else {
            out.println("The item's with this name weren't found.");
        }
        return true;
    }
}
