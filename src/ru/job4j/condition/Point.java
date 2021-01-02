package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double r1 = x2 - x1;
        double r2 = y2 - y1;
        double r3 = Math.pow(r1,2);
        double r4 = Math.pow(r2,2);

        return Math.sqrt(r3+r4);
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
