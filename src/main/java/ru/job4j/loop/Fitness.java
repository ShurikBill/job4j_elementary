package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            System.out.println(month);
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println(calc(90, 100));
    }
}
