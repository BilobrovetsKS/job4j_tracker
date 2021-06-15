package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void createItem() {
        String[] answer = {"TestItem"};
        Input input = new StubInput(answer);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("TestItem");
        Assert.assertEquals(created.getName(), expected.getName());
    }

    @Test
    public void replaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("TestItem");
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId()), "Next Item"};

        StartUI.replaceItem(new StubInput(answer), tracker);
        Item replace = tracker.findById(item.getId());
        assertThat(replace.getName(), is("Next Item"));
    }

    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New Item");
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId())};

        StartUI.deleteItem(new StubInput(answer), tracker);
        Item delete = tracker.findById(item.getId());
        assertNull(delete);
    }
}