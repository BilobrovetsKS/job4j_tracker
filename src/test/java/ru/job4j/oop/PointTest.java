package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import java.io.PipedOutputStream;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testDistance1() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2, 0.0001));
    }

    @Test
    public void testDistance2() {
        Point a = new Point(4, 2);
        Point b = new Point(2, 1);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2.23, 0.01));
    }

    @Test
    public void testDistance3() {
        Point a = new Point(4, 2, 1);
        Point b = new Point(2, 1, 3);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(3, 0.01));
    }
}