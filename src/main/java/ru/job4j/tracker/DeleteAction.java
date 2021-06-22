package ru.job4j.tracker;

import java.util.Date;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out){
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ===");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Item is delete");
        }else {
            out.println("Error, id is not found");
        }
        return true;
    }
}
