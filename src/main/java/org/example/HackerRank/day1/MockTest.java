package org.example.HackerRank.day1;


import java.util.List;
import java.util.stream.Collectors;

public class MockTest {

    public void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }


//The median of a list of numbers is essentially its middle element after sorting. The same number of
//elements occur after it as before. Given a list of numbers with an odd number of elements, find the median?
//Example
//The sorted array . The middle element and the median is .
//Function Description
//Complete the findMedian function in the editor below.
//findMedian has the following parameter(s):
//Sorting Search Algorithms Easy problem-solving Core CS
//Problem-Solving
//QUESTION DESCRIPTION
// 
//QUESTION 1
//Correct Answer
//Score 105
//
//
//Mock Test roszak89@gmail.com
//2/3
//int arr[n]: an unsorted array of integers
//Returns
//int: the median of the array
//Input Format
//The first line contains the integer , the size of .
//The second line contains space-separated integers
//Constraints
//is odd
//Sample Input 0
//7
//0 1 2 4 6 5 3
//Sample Output 0
//3
//Explanation 0
//The sorted . It's middle element is at .

    public int findMedian(List<Integer> arr) {
        arr = arr.stream().sorted().collect(Collectors.toList());
        return arr.get(arr.size() / 2);
    }
}
