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
        Item[] all = new Item[size];
        int sizeNew = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (items[i] != null) {
                all[sizeNew] = item;
                sizeNew++;
            }
        }
        return Arrays.copyOf(all, sizeNew);
    }

    public Item[] findByName(String key) {
        Item[] findName = new Item[size];
        int sizeName = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                findName[sizeName] = item;
                sizeName++;
            }
        }
        return Arrays.copyOf(findName, sizeName);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        items[index] = item;
        item.setId(id);
        return index != -1 ? true : false;
    }
}