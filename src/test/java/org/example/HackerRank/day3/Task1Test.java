package org.example.HackerRank.day3;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1 = new Task1();

    @Test
    void findZigZagSequence_first() throws Exception {
        int[] array = {2,3,5,1,4};
        int n = array.length;

        String result = tapSystemOut(() -> {
            task1.findZigZagSequence(array, n);
        });

        assertEquals("1 2 5 4 3", result);

    }
    @Test
    void findZigZagSequence_second() throws Exception {
        int[] array = {3,1,2};
        int n = array.length;

        String result = tapSystemOut(() -> {
            task1.findZigZagSequence(array, n);
        });

        assertEquals("1 3 2", result);

    }
    @Test
    void findZigZagSequence_third() throws Exception {
        int[] array = {2,3,5,1,4,6,7};
        int n = array.length;

        String result = tapSystemOut(() -> {
            task1.findZigZagSequence(array, n);
        });

        assertEquals("1 2 3 7 6 5 4", result);

    }
}