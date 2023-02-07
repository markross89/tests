//package org.example.HackerRank.day1;
//
//import java.util.Arrays;
//import java.util.Random;
//
//    int count = 0;
//            for (int i = 1; i < M; i++) {
//        for (int j = 0;  j<N; j++) {
//
//        if(a[i][j]==1){
//        count++;
//        }else if(a[j][i]==1){
//        count++;
//        }
//        }
//        }
//        return count;
//
//public class AtlassianExam {
//
//    public static void main(String[] args) {
//
//
//
//        int[][] matrix = new int[2][2];
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0;  j< 2; j++) {
//                matrix[i][j]= (int)Math.round( Math.random() )  ;
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
//        System.out.println(numberOfPaths(matrix,2,2));
//
//    }
//
//    static int numberOfPaths(int [][]a,int M,int N) {
//        int count = 0;
//        for (int i = 1; i < M; i++) {
//            for (int j = 0;  j<N; j++) {
//
//                if(a[i][j]==1){
//                    count++;
//                }else if(a[j][i]==1){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}
