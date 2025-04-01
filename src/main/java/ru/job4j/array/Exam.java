package ru.job4j.array;

public class Exam {
    public static int[] getSquareAndRevers(int[] array) {
        int[] result = new int[array.length];
        int i = 0;
        int j = array.length - 1;
        int index = array.length - 1;
        while (i <= j) {
            double i2 = Math.pow(array[i], 2);
            double j2 = Math.pow(array[j], 2);
            if (i2 > j2) {
                result[index] = (int) i2;
                i++;
            } else {
                result[index] = (int) j2;
                j--;
            }
            index--;
        }
        return result;
    }
}