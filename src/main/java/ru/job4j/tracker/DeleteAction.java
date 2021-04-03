package ru.job4j.tracker;

public class DeleteAction implements  UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==== Delete the Item ====");
        int id = input.askInt("Enter ID: ");
        boolean rsl = tracker.delete(id);
        if (rsl) {
            out.println("The operation was completed successfully.");
        } else {
            out.println("The operation cannot be completed.");
        }
        return true;
    }
}
