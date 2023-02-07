package org.example.HackerRank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        System.out.println(findNumber(Arrays.asList(1, 2, 3, 4, 5, 6), 5));
        System.out.println(oddNumbers(7,5));
    }

    public static String findNumber(List<Integer> arr, int k) {
        if (arr.contains(k)) {
            return "YES";
        }
        return "NO";
    }

    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> odd = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                odd.add(i);
            }
        }
        return odd;
    }
}
