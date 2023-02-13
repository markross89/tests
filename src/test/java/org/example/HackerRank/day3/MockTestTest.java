package org.example.HackerRank.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MockTestTest {

    MockTest mockTest = new MockTest();

    @Test
    void palindromeIndexTest_first() {
        String palindrome = "aaab";

        int result = mockTest.palindromeIndex(palindrome);

        assertEquals(3, result);
    }

    @Test
    void palindromeIndexTest_second() {
        String palindrome = "aaa";

        int result = mockTest.palindromeIndex(palindrome);

        assertEquals(-1, result);
    }

    @Test
    void palindromeIndexTest_third() {
        String palindrome = "abab";

        int result = mockTest.palindromeIndex(palindrome);

        assertEquals(0, result);
    }
}