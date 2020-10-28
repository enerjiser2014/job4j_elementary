package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int coinsSum = 0;
        int size = 0;

        for (int i = 0; i < COINS.length; i++) {
            while (coinsSum + price + COINS[i] <= money) {
                rsl[size] = COINS[i];
                coinsSum += COINS[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
