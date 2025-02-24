package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = false;
        for (int index = postfix.length - 1; index >= 0; index--) {
            if (word[index] == postfix[index]) {
                result = true;
                break;
            }
        }
        return result;
    }
}