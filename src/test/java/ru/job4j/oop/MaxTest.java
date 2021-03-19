package ru.job4j.oop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class MaxTest {

    @Test
    public void testMax1() {
        Max maximum = new Max();
        int x = 5;
        int y = 7;
        int rsl = maximum.max(x, y);
        assertThat(rsl, is(7));
    }

    @Test
    public void testMax2() {
        Max maximum = new Max();
        int x = 5;
        int y = 7;
        int z = 9;
        int rsl = maximum.max(x, y, z);
        assertThat(rsl, is(9));
    }

    @Test
    public void testMax3() {
        Max maximum = new Max();
        int x = 11;
        int y = 7;
        int z = 9;
        int a = 10;
        int rsl = maximum.max(x, y, z, a);
        assertThat(rsl, is(11));
    }
}