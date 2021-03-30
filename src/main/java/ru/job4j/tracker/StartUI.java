package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("==== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItems(Input input, Tracker tracker) {
        Item[] rsl = tracker.findAll();
        for (Item item : rsl) {
            System.out.println(item);
        }
    }

    public static void editItem(Input input, Tracker tracker) {
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
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==== Delete the Item ====");
        int id = input.askInt("Enter ID: ");
        boolean rsl = tracker.delete(id);
        if (rsl) {
            System.out.println("The operation was completed successfully.");
        } else {
            System.out.println("The operation cannot be completed.");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("==== Find item by ID ====");
        int id = input.askInt("Enter ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("The item with this ID wasn't found.");
        }
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("==== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] rsl = tracker.findByName(name);
        if (rsl.length > 0) {
            for (Item item : rsl) {
                System.out.println(item);
            }
        } else {
            System.out.println("The item's with this ID weren't found.");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = input.askInt("Choose the menu's option: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            }  else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
            System.out.println();
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");

    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
