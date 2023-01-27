package org.example.HackerRank.day2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1 = new Task1();


    @Test
    void lonelyInteger() throws Exception {
        assertEquals(4, task1.lonelyInteger(Arrays.asList(1, 2, 3, 1, 2, 3, 4)));
        assertEquals(1, task1.lonelyInteger(Arrays.asList(1, 2, 2)));
        assertEquals(10, task1.lonelyInteger(Arrays.asList(1, 2, 3, 1, 2, 3, 4,4,10)));
    }
}