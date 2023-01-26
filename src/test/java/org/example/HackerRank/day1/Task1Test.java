package org.example.HackerRank.day1;

import org.example.HackerRank.day1.Task1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    Task1 plusMinus = new Task1();

    @Test
    void plusMinus_firstScenario() throws Exception {
       List<Integer> integers = Arrays.asList(1, 1, 0, -1, -1);

        String text = tapSystemOut(() -> {
            plusMinus.plusMinus(integers);
        });

        assertEquals("0.400000\n" +
                              "0.400000\n" +
                              "0.200000", text.trim());
    }

    @Test
    void plusMinus_secondScenario() throws Exception {
        List<Integer> integers = Arrays.asList(-4, 3, -9, 0, 4, 1);

        String text = tapSystemOut(() -> {
            plusMinus.plusMinus(integers);
        });

        assertEquals("0.500000\n" +
                              "0.333333\n" +
                              "0.166667", text.trim());
    }

    @Test
    void plusMinus_thirdScenario() throws Exception {
        List<Integer> integers = List.of(0);

        String text = tapSystemOut(() -> {
            plusMinus.plusMinus(integers);
        });

        assertEquals("0.000000\n" +
                              "0.000000\n" +
                              "1.000000", text.trim());
    }
}