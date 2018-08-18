package com.example.leetcode;
//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

import java.util.Scanner;

//        Given two integers x and y, calculate the Hamming distance.
/*
 * created by divya at 7/15/2018
 */
public class Hamming_Distance {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int y = in.nextInt();

        System.out.println(hammingDistance(x, y) );
    }

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
