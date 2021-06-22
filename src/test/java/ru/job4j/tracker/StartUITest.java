package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void createItem() {
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(),
                new ExitAction()};
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void replaceItem() {
    Tracker tracker = new Tracker();
    Item item = tracker.add(new Item("Replaced item"));
    String replacedName = "New Item";
    Input in = new StubInput(new String[] {"0", "1", replacedName, "1"});
    UserAction[] actions = {new ReplaceAction(),
    new ExitAction()};
    new StartUI().init(in, tracker, actions);
    assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }



    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted  Item"));
        Input in = new StubInput(new String[] {"0", "1", "1"});
        UserAction[] actions = {new DeleteAction(),
                new ExitAction()};
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}

