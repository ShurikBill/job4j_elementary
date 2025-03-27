package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExamTest {
    @Test
    void getSquareAndRevers6() {
        int[] array = {6, 5, 4, 3, 2, 1};
        int[] result = Exam.getSquareAndRevers(array);
        int[] expected = {1, 4, 9, 16, 25, 36};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getSquareAndRevers5() {
        int[] array = {5, 4, 3, 2, 1};
        int[] result = Exam.getSquareAndRevers(array);
        int[] expected = {1, 4, 9, 16, 25};
        assertThat(result).isEqualTo(expected);
    }
}
