package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int sum = 1;
        for (int i = 2 ; i <= number; i++) {
            sum = sum * i;
        }
        return sum ;
    }

    public static void main(String[] args) {
        System.out.println(calculate(6));
        System.out.println(calculate(8));
        System.out.println(calculate(10));
    }
}