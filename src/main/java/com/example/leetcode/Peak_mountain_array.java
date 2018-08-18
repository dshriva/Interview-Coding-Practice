package com.example.leetcode;

import java.util.Scanner;

/*
 * created by divya at 7/17/2018
 */
public class Peak_mountain_array {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
       int A[] = {0,2,1,0};


        System.out.println(peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A) {
        int max =A[0];
        for(int i=0; i<A.length -1;i++){
            if(A[i] < A[i+1]){
                max= i+1;
            }
        }
        return max;
    }
}
