package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {
    @Test
    public void testDistance1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, is(2.0));
    }

    @Test
    public void testDistance2() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 6);
        double dist = a.distance(b);
        assertThat(dist, is(5.0));
    }

    @Test
    public void testDistance3() {
        Point a = new Point(6, 10);
        Point b = new Point(3, 2);
        double dist = a.distance(b);
        assertThat(dist, closeTo(8.0, 0.6));
    }

    @Test
    public void test1Distance3DFirst() {
        Point a = new Point(6, 10, 4);
        Point b = new Point(3, 2, 7);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(9, 0.1));
    }

    @Test
    public void testDistance3DSecond() {
        Point a = new Point(0, 5, 0);
        Point b = new Point(0, 2, 0);
        double dist = a.distance3d(b);
        assertThat(dist, is(3.0));
    }

}