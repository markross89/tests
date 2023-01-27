package org.example.HackerRank.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    Task3 task3 = new Task3();

    @Test
    void countingSort() {
        Assertions.assertIterableEquals(Arrays.asList(0, 3, 1, 1, 0, 0, 0, 0, 0, 0), task3.countingSort(Arrays.asList(1,1,1,2,3)));
        Assertions.assertIterableEquals(Arrays.asList(0, 3, 1, 1, 0, 1, 0, 0, 0, 1), task3.countingSort(Arrays.asList(1,1,1,2,3,5,9)));
        Assertions.assertIterableEquals(Arrays.asList(0, 2, 2, 2, 0, 0, 0, 0, 0, 0), task3.countingSort(Arrays.asList(1,2,1,2,3,3)));
    }


}