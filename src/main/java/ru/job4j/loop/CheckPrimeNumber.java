package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        boolean rsl = true;
        for (int i = 2; i < number; i++) {
             if (number % i == 0) {
                 rsl = false;
                 break;
             }
        }
        return rsl;
    }
}