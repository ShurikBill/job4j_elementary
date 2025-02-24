package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int index = 0; index < right.length; index++) {
            if (left[left.length - 1] == right[right.length - 1]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
