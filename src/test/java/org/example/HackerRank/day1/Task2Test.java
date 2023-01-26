package org.example.HackerRank.day1;

import org.example.HackerRank.day1.Task2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    Task2 task2 = new Task2();

    @Test
    void miniMaxSum_firstScenario() throws Exception {
        List<Integer> integers  = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);

        String text = tapSystemOut(() -> {
            task2.miniMaxSum(integers);
        });

        assertEquals("2063136757 2744467344", text.trim());
    }

    @Test
    void miniMaxSum_secondScenario() throws Exception {
        List<Integer> integers  = Arrays.asList(1, 2, 3, 4, 5);

        String text = tapSystemOut(() -> {
            task2.miniMaxSum(integers);
        });

        assertEquals("10 14", text.trim());
    }

    @Test
    void miniMaxSum_thirdScenario() throws Exception {
        List<Integer> integers  = List.of(0,0,0,0,0);

        String text = tapSystemOut(() -> {
            task2.miniMaxSum(integers);
        });

        assertEquals("0 0", text.trim());
    }
}