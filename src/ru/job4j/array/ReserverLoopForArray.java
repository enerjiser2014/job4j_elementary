package ru.job4j.array;

public class ReserverLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int index;
        for (int i = 0; i < numbers.length; i++) {
            index = numbers.length-i-1;
            if ( index % 2 == 0 && index != 0) {
                System.out.println(numbers[index]);
            }

        }
    }
}
