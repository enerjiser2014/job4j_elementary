package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        // double s = k * p / (2*k + 2);
        double h = p / (double) (2 * (k+1));
        double l = h * k;
        return l * h; // s
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6,2);
        System.out.println("p = 4, k = 1; s = " + result1);
        double result2 = SqArea.square(6,3);
        System.out.println("p = 6, k = 2; s = " + result2);
    }
}
