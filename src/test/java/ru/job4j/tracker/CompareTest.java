package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CompareTest {

    @Test
    public void ascCompare() {
        Item item1 = new Item("c");
        Item item2 = new Item("b");
        Item item3 = new Item("a");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Collections.sort(items);
        assertThat(items.get(0).getName(), is("a"));
        assertThat(items.get(1).getName(), is("b"));
        assertThat(items.get(2).getName(), is("c"));
    }

    @Test
    public void descCompare() {
        Item item1 = new Item("a");
        Item item2 = new Item("b");
        Item item3 = new Item("c");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        DescItemComparator descItemComparator = new DescItemComparator();
        items.sort(descItemComparator);
        assertThat(items.get(0).getName(), is("c"));
        assertThat(items.get(1).getName(), is("b"));
        assertThat(items.get(2).getName(), is("a"));
    }
}