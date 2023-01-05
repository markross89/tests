package org.example;

import java.util.Arrays;
import java.util.stream.LongStream;

public class FactorialTrail {

    public static void main(String[] args) {

        System.out.println(zeros(12));

    }

    public static int zeros(int n) {

        long factorial = LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);

        String factorialString = LongStream.of(factorial).toString();
        char[] factorialDigits = factorialString.toCharArray();
        int result = 0;
        for (int i = factorialDigits.length-1; i >0 ; i--) {

            if (factorialDigits[i]==0){
                result++;
            }else{
                return result;
            }
        }
        return result;
    }
}
