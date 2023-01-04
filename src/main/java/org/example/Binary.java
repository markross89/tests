package org.example;


public class Binary {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n) {

        return (int) Integer.toBinaryString(n).chars().filter(c -> c == '1').count();
    }


//    public static int countBits(int n){
//        int count = 0;
//        String result = Integer.toBinaryString(n);
//        char[] resultArray = result.toCharArray();
//        for (char c:resultArray) {
//            if (c=='1'){
//                count++;
//            }
//        }
//        return count;
//    }


//
//    public static int countBits(int n) {
//
//        return Integer.bitCount(n);
//    }
}
