package org.example.HackerRank.day4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    Task2 task2 = new Task2();

    @Test
    void gridChallenge_first() {
        List<String> grid = Arrays.asList("abc", "hjk", "mpq", "rtv");

        String result = task2.gridChallenge(grid);

        assertEquals("YES", result);
    }

    @Test
    void gridChallenge_second() {
        List<String> grid = Arrays.asList("abc", "ade", "efg");

        String result = task2.gridChallenge(grid);

        assertEquals("YES", result);
    }

    @Test
    void gridChallenge_third() {
        List<String> grid = Arrays.asList("abc", "zzz", "zfe" );

        String result = task2.gridChallenge(grid);

        assertEquals("NO", result);
    }
}