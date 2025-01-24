package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number){
        int i = 2;
        for (i =2; i <= number; i++) {
            if (number % i == 0)
                return false;
            {
                break;
            }
        }
            return false;
    }
}