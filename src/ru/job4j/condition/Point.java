package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double r1 = x2 - x1;
        double r2 = y2 - y1;
        double r3 = Math.pow(r1,2);
        double r4 = Math.pow(r2,2);

        return Math.sqrt(r3+r4);
    }
    public static void main(String[] args) {
        double result = Point.distance(0,0,2,0);
        System.out.println("result (0,0) to (2,0) : " + result);
    }
}
