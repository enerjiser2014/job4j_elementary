package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expceted = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expceted, out, 0.01);
    }

    @Test
    public void when00to22then2p82() {
        double expceted = 2.82;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expceted, out, 0.01);
    }

    @Test
    public void when00to02then2() {
        double expceted = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expceted, out, 0.01);
    }

    @Test
    public void when00to21then2p23() {
        double expceted = 2.23;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expceted, out, 0.01);
    }
}