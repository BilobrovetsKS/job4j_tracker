package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.ex.User;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void createItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out),
                new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void replaceItem() {
        Output out = new StubOutput();
    Tracker tracker = new Tracker();
    Item item = tracker.add(new Item("Replaced item"));
    String replacedName = "New Item";
    Input in = new StubInput(new String[] {"0", "1", replacedName, "1"});
    UserAction[] actions = {new ReplaceAction(out),
    new ExitAction(out)};
    new StartUI(out).init(in, tracker, actions);
    assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }



    @Test
    public void deleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted  Item"));
        Input in = new StubInput(new String[] {"0", "1", "1"});
        UserAction[] actions = {new DeleteAction(out),
                new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void findByIdItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find by Id Items"));
        Input in = new StubInput(new String[] {"0", "1", "1"});
        UserAction[] actions = {new FindByIdAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.Find item by id" + System.lineSeparator() +
                        "1.Exit Program" + System.lineSeparator() +
                        "User chooses: 0" + System.lineSeparator() +
                        "=== Find by id ===" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.Find item by id" + System.lineSeparator() +
                        "1.Exit Program" + System.lineSeparator() +
                        "User chooses: 1" + System.lineSeparator()
        ));
    }

    @Test
    public void findByNameItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String name = "Find by Name Items";
        Item item = tracker.add(new Item(name));
        Input in = new StubInput(new String[] {"0", name, "1"});
        UserAction[] actions = {new FindByNameAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.Find items by name" + System.lineSeparator() +
                        "1.Exit Program" + System.lineSeparator() +
                        "User chooses: 0" + System.lineSeparator() +
                        "=== Find by name ===" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.Find items by name" + System.lineSeparator() +
                        "1.Exit Program" + System.lineSeparator() +
                        "User chooses: 1" + System.lineSeparator()
        ));
    }

    @Test
    public void ShowallItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Show all Item"));
        Input in = new StubInput(new String[] {"0", "1"});
        UserAction[] actions = { new ShowAllAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.Show all items" + System.lineSeparator() +
                        "1.Exit Program" + System.lineSeparator() +
                        "User chooses: 0" + System.lineSeparator() +
                        "=== Show all Items ===" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0.Show all items" + System.lineSeparator() +
                        "1.Exit Program" + System.lineSeparator() +
                        "User chooses: 1" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"-1", "0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[] {new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0.Exit Program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0.Exit Program" + ln +
                        "User chooses: 0" + ln
        ));
    }
}

