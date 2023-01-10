package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadFishParser {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(parse("aoiiisdoso")));
    }

    public static int[] parse(String data) {

        List<Integer> results = new ArrayList<>();
        int value = 0;

        for (int i = 0; i < data.length(); i++) {

            char c = data.charAt(i);

            switch (c) {
                case 'i' -> value++;
                case 'd' -> value--;
                case 's' -> value *= value;
                case 'o' -> results.add(value);
            }
        }
        return results.stream().mapToInt(d -> d).toArray();
    }
}
