package org.example.HackerRank.day2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    Task2 task2 = new Task2();

    @Test
    void diagonalDifference() {
        List<List<Integer>> matrix1 = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(9,8,9));
        List<List<Integer>> matrix2 = Arrays.asList(Arrays.asList(10,3,3), Arrays.asList(4,5,6), Arrays.asList(9,2,9));
        List<List<Integer>> matrix3 = Arrays.asList(Arrays.asList(10,3,34), Arrays.asList(4,27,6), Arrays.asList(1,2,9));

        int result1 = task2.diagonalDifference(matrix1);
        int result2 = task2.diagonalDifference(matrix2);
        int result3 = task2.diagonalDifference(matrix3);

        assertEquals(2, result1);
        assertEquals(7, result2);
        assertEquals(16, result3);
    }
}