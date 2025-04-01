package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExamTest {
    @Test
    void getSquareAndRevers6() {
        int[] array = {6, 5, 4, 3, 2, 1, -1, -5};
        int[] result = Exam.getSquareAndRevers(array);
        int[] expected = {1, 1, 4, 9, 16, 25, 25, 36};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getSquareAndRevers5() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        int[] result = Exam.getSquareAndRevers(array);
        int[] expected = {0, 1, 1, 4, 4, 9, 9, 16, 16, 25, 25, 36, 36, 49, 49, 64, 64, 81, 81, 100, 100};
        assertThat(result).isEqualTo(expected);
    }
}
