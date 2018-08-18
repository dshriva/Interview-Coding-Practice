package com.example.leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//        The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
/*
 * created by divya at 7/14/2018
 */
public class Jewels_and_Stones {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String jewel = in.nextLine();
        String stone = in.nextLine();

        System.out.println(numJewelsInStones(jewel, stone));
    }

    public static int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<Character>();
        for (char j : J.toCharArray()) {
            set.add(j);
        }
        int count = 0;
        for (char s : S.toCharArray()) {
            if (set.contains(s)) {
                count++;
            }
        }
        return count;
    }
}