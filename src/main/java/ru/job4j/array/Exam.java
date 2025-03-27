package ru.job4j.array;

public class Exam {
    public static int[] getSquareAndRevers(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            int temp = (int) Math.pow(array[i], 2);
            array[i] = (int) Math.pow(array[j], 2);
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
}
