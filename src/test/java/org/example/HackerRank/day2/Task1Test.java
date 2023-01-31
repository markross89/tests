package org.example.HackerRank.day2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1 = new Task1();


    @Test
    void lonelyInteger_first() throws Exception {
        assertEquals(1, task1.lonelyInteger(Arrays.asList(1, 2, 2)));
    }
    @Test
    void lonelyInteger_second() throws Exception {
        assertEquals(10, task1.lonelyInteger(Arrays.asList(1, 2, 3, 1, 2, 3, 4,4,10)));
    }
    @Test
    void lonelyInteger_third() throws Exception {
        assertEquals(4, task1.lonelyInteger(Arrays.asList(1, 2, 3, 1, 2, 3, 4)));
    }
}