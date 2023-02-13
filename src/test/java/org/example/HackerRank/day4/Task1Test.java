package org.example.HackerRank.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1 = new Task1();

    @Test
    void superDigit_first() {
        String number = "9875";
        int k = number.length();

        int result = task1.superDigit(number, k);

        assertEquals(8, result);
    }

    @Test
    void superDigit_second() {
        String number = "43745";
        int k = number.length();

        int result = task1.superDigit(number, k);

        assertEquals(7, result);
    }

    @Test
    void superDigit_third() {
        String number = "235252";
        int k = number.length();

        int result = task1.superDigit(number, k);

        assertEquals(6, result);
    }
}