package ru.job4j.tracker;


public class StartUI {
    public static void createItem (Input input, Tracker tracker) {
        System.out.println("=== Create new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Item created: " + item);
    }

    public static void showAllItem(Tracker tracker) {
        System.out.println("=== Show all Items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("There are not Items");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item is changed");
        } else {
            System.out.println("Error, id is not found");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item is delete");
        }else {
            System.out.println("Error, id is not found");
        }
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("=== Find by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Error, id: " + id + " is not found");
        }
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("=== Find by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item array: items) {
                System.out.println(array);
            }
        } else {
            System.out.println("Error, that names are not found");
        }
    }

    public void init (Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            System.out.println("User chooses: " + select);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
            }
        }


    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + "." + actions[i].name());

        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new ShowAllAction(), new ReplaceAction(),
                new DeleteAction(), new FindByIdAction(), new FindByNameAction(), new ExitAction()};
        new StartUI().init(input, tracker, actions);
    }
}