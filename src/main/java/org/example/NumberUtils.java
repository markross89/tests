package org.example;

import java.util.*;

public class NumberUtils {

//    A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits,
//    each raised to the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).
//    For example, take 153 (3 digits), which is narcisstic:
//
//    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//
//    and 1652 (4 digits), which isn't:
//
//    1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
//
//    The Challenge:
//    Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic number
//    in base 10. This may be True and False in your language, e.g. PHP.

    public static void main(String[] args) {

        System.out.println(isNarcissistic(0));

    }
    public static boolean isNarcissistic ( int number){

        List<Integer> stack = new ArrayList<>();
        int testNumber = number;
        while (testNumber > 0) {
            stack.add(testNumber % 10);
            testNumber = testNumber / 10;
        }
        int listSize = stack.size();
        int sum = 0;
        for (int i = listSize-1; i >= 0; i--) {
            sum += (Math.pow(stack.get(i), listSize));
        }
        return sum == number;
    }
}