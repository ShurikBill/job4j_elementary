package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int check = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= check) {
                result[size++] = coins[i];
                check -= coins[i];
            }
        }
        return Arrays.copyOf(result, size);
    }
}