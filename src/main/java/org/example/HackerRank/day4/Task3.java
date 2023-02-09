package org.example.HackerRank.day4;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4);
        List<Integer> q = new ArrayList<>(list);

        minimumBribes(q);

    }

    public static void minimumBribes(List<Integer> q) {

        int totalBribes = 0;
        int listSize = q.size();

        for (int i = listSize -1; i >= 0; i--) {
            if (i-q.indexOf(i+1) > 2) {
                System.out.println("Too chaotic");
                q.remove(3);
                break;

            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++)
                if (q.get(j) > q.get(i)) totalBribes++;
        }
        System.out.println(totalBribes);
    }
//    public static void minimumBribes(List<Integer> w) {
//
//        String message = "";
//        int totalBribes = 0;
//        int onePerson;
//        int onePersonBribe = 0;
//        int counter;
//
//
//        Integer[] q = w.toArray(new Integer[0]);
//        counter = q.length - 1;
//
//        int size = q.length;
//
//        for (int i = size - 1; i >= 0; i--) {
//
//            onePerson = i + 1;
//
//            for (int j = 0; j < size; j++) {
//                if (q[j] == onePerson) {
//                    for (int k = j; k < i; k++) {
//                        q[k] = q[k + 1];
//                        totalBribes++;
//                        onePersonBribe++;
//                    }
//                    q[counter] = onePerson;
//                    break;
//                }
//            }
//            if (onePersonBribe > 2) {
//                message = "Too chaotic";
//                break;
//            } else {
//                message = String.valueOf(totalBribes);
//            }
//            counter--;
//            onePersonBribe = 0;
//        }
//        System.out.println(message);

}
