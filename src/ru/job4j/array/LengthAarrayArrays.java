package ru.job4j.array;

public class LengthAarrayArrays {
    public static void main(String[] args) {
        int[][] numbers = { {1}, {1,2}, {1,2,3}, {1,2,3,4}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
