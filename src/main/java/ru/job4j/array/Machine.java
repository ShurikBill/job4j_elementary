package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        for (int coin : coins) {
            while (coin <= money - price) {
                result[size++] = coin;
                price += coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}