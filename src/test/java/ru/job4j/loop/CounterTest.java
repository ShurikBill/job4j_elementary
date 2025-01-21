package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import ru.job4j.loop.Counter;

public class CounterTest {

    @Test
    void whenStart1AndFinish10Then55() {
        int start = 1, finish = 10;
        double expected = 55;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }


    @Test
    void whenStart5AndFinish7Then18() {
        int start = 10, finish = 1;
        double expected = 0;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
