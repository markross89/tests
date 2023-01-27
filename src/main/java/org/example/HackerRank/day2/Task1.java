package org.example.HackerRank.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//Given an array of integers, where all elements but one occur twice, find the unique element.
//
//Example
//The unique element is
//
//.
//
//Function Description
//
//Complete the lonelyinteger function in the editor below.
//
//lonelyinteger has the following parameter(s):
//
//    int a[n]: an array of integers
//
//Returns
//
//    int: the element that occurs only once
//
//Input Format
//
//The first line contains a single integer,
//, the number of integers in the array.
//The second line contains space-separated integers that describe the values in
//
//.
//
//Constraints
//
//It is guaranteed that
//is an odd number and that there is one unique element.
//, where .



public class Task1 {

    public int lonelyInteger(List<Integer> a) {
        a = a.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < a.size() - 1; i += 2) {
            if (!Objects.equals(a.get(i), a.get(i + 1))) {
                return a.get(i);
            }
        }
        return a.get(a.size()-1);
    }
}
