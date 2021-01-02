package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int arg1, int arg2, int arg3) {
        return max(
                max(arg1, arg2), arg3);
    }

    public static int max(int arg1, int arg2, int arg3, int arg4) {
        return max(
                max(arg1, arg2, arg3), arg4);
    }


    public static void main(String[] args) {
        System.out.println(Max.max(1, 2));
    }
}
