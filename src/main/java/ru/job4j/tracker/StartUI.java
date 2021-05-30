package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("Petr", 1);
        tracker.add(item);
        Item byId = tracker.findById(1);
        System.out.println("name: " + byId.getName() + System.lineSeparator() + "id: " + byId.getId());
        }
    }
