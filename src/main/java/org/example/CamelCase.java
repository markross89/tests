package org.example;

import java.util.Arrays;

public class CamelCase {

    public static void main(String[] args) {

        System.out.println(camelCase("MarekRoszak"));
    }

    public static String camelCase(String input) {

        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                sb.append(" ").append(aChar);
            } else {
                sb.append(aChar);
            }
        }
        return sb.toString().trim();
    }
}
