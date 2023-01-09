package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("marekroszak")));
    }

    public static String[] solution(String s) {
        List<String> doubles = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i += 2) {
            doubles.add(s.substring(i, i + 2));
        }
        if (s.length() % 2 != 0) {
            doubles.add(s.substring(s.length() - 1) + "_");
        }
        return doubles.toArray(new String[0]);
    }
}
