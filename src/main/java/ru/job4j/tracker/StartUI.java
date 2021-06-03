package ru.job4j.tracker;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.print("=== Create new item ===" + System.lineSeparator() +
                        "Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] all = tracker.findAll();
                for (int i = 0; i < all.length; i++) {
                    Item nam = all[i];
                    System.out.println(nam);
                }
            } else if (select == 2) {
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                tracker.replace(id, newItem);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Successfully");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 3) {
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Successfully");
                } else {
                    System.out.println("Error");
                }
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item byId = tracker.findById(id);
                if (byId != null) {
                    System.out.println(byId);
                } else {
                    System.out.println("Item with this Id is not found");
                }
            } else if (select == 5) {
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] byName = tracker.findByName(name);
                if (byName.length > 0) {
                    for (int i = 0; i < byName.length; i++) {
                        Item nam = byName[i];
                        System.out.println(nam);
                    }
                } else {
                    System.out.println("Item with this name is not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public void showMenu() {
        System.out.println("Menu:");
        System.out.println("0. Add new Item" + System.lineSeparator() +
        "1. Show all items" + System.lineSeparator() +
            "2. Edit item" + System.lineSeparator() +
                "3. Delete item" + System.lineSeparator() +
                "4. Find item by Id" + System.lineSeparator() +
                "5. Find items by name" + System.lineSeparator() +
                "6. Exit Program");


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
        }
    }
