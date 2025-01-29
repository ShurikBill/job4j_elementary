package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = n ; s >= 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
