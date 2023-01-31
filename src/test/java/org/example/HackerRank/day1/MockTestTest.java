package org.example.HackerRank.day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class MockTestTest {

    MockTest mockTest = new MockTest();

    @Test
    void fizzBuzz_firstTest() throws Exception {
        int n = 15;

        String text = tapSystemOut(() -> {
            mockTest.fizzBuzz(n);
        });

        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz", text.trim());
    }

    @Test
    void fizzBuzz_secondTest() throws Exception {
        int n = 10;

        String text = tapSystemOut(() -> {
            mockTest.fizzBuzz(n);
        });

        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz", text.trim());
    }

    @Test
    void findMedianTest_first() {
        assertEquals(4,mockTest.findMedian(Arrays.asList(2,3,4,7,1,7,6)));
    }
    @Test
    void findMedianTest_second() {
        assertEquals(0,mockTest.findMedian(Arrays.asList(0,0,0,0,0)));
    }
    @Test
    void findMedianTest_third() {
        assertEquals(3,mockTest.findMedian(Arrays.asList(1,2,3,4,5)));
    }
}