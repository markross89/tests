package org.example.HackerRank.day4;

import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        System.out.println(gridChallenge(Arrays.asList("abc", "hjk", "mpq", "rtv")));

    }

    public static String gridChallenge(List<String> grid) {

        for (int i = 0; i < grid.size(); i++) {
            char[] chars = grid.get(i).trim().replace(" ", "").toLowerCase().toCharArray();
            Arrays.sort(chars);
            grid.set(i, String.valueOf(chars));
            System.out.println(chars);
        }
        System.out.println();
        for (int i = 0; i < grid.get(0).length(); i++) {
            for (int j = 0; j < grid.size() - 1; j++) {
                char x = grid.get(j).charAt(i);
                char y = grid.get(j + 1).charAt(i);
                System.out.println(x +" "+ y);

                if (x > y) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
