package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * created by divya at 7/19/2018
 */
public class FizzBuzz {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        System.out.println(fizzbuzz(n));
    }

    private static List<String> fizzbuzz(int n) {
        List<String> list =new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

}
