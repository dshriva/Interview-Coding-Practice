package com.example.leetcode.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * created by divya at 7/19/2018
 */
public class Array_Partition1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] x= {1,4,3,2};


        System.out.println(array_partition(x) );
    }

    private static int array_partition(int[] x) {
        int result =0;
        Arrays.sort(x);
        for(int i=0; i<x.length -1 ; i=i+2){
             result = result + x[i];
        }
        return result;
    }

}
