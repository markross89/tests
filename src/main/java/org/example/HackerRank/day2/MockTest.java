package org.example.HackerRank.day2;

import java.util.Arrays;
import java.util.List;


//1. Flipping the Matrix
//
//    Sean invented a game involving a matrix where each cell of the matrix contains an integer.
//    He can reverse any of its rows or columns any number of times. The goal of the game is to maximize the sum of the elements in the
//    sub-matrix located in the upper-left quadrant of the matrix. Given the initial configurations for matrices,
//    help Sean reverse the rows and columns of each matrix in the best possible way so that the sum of the elements in the matrix's upper-left quadrant is maximal.
//
//    Example
//
//    1 2
//    3 4
//
//    we want to maximize the top left quadrant, of a matrix. Reverse row 2
//
//    1 2
//    4 3
//
//    And now reverse column 1
//
//    4 2
//    1 3
//
//    The maximal sum is 4

//    Function Description
//
//    Complete the flippingMatrix function in the editor below.
//
//     flippingMatrix has the following parameters:
//-    int matrix[2n][2n]: a 2-dimensional array of integers
//
//     Returns
//-    nt: the maximum sum possible.
//
//     Input Format
//
//     The first line contains an integer the number of queries.
//
//     The next sets of lines are in the following format:
//     The first line of each query contains an integer,
//     Each of the next lines contains space-separated integers in row of the matrix.
//
//Sample Input
//
//STDIN           Function
//-----           --------
//1               q = 1
//2               n = 2
//112 42 83 119   matrix = [[112, 42, 83, 119], [56, 125, 56, 49], \
//56 125 56 49              [15, 78, 101, 43], [62, 98, 114, 108]]
//15 78 101 43
//62 98 114 108
//
//Sample Output
//
//414
//
//Explanation
//
//Start out with the following
//
//matrix:
//
//
//    Perform the following operations to maximize the sum of the
//
//    sub-matrix in the upper-left quadrant:
//
//    Reverse column (), resulting in the matrix:
//    Reverse row (), resulting in the matrix:
//    The sum of values in the sub-matrix in the upper-left quadrant is 414.

public class MockTest {
    public static void main(String[] args) {
        int result = flippingMatrix(Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8), Arrays.asList(9, 10, 11, 12)));
        System.out.println(result);
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        System.out.println(matrix);

        return 1;
    }

}
