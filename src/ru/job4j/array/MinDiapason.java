package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        int endloop = finish > array.length-1 ? array.length-1 : finish;
        for (int i = start; i <= endloop ; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
