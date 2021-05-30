package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] all = new Item[items.length];
        int sizeNew = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (items[i] != null) {
                all[sizeNew] = item;
                sizeNew++;
            }
        }
        all = Arrays.copyOf(all, sizeNew);
        return all;
    }

    public Item[] findByName(String key) {
        Item[] findName = new Item[items.length];
        int sizeName = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                findName[sizeName] = item;
                sizeName++;
            }
        }
        findName = Arrays.copyOf(findName, sizeName);
        return findName;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}