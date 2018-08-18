package com.example.leetcode;

import java.util.Scanner;

//Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
/*
 * created by divya at 7/15/2018
 */
public class toLowerCase {
    public static void main(String args[]) {
        //Scanner in = new Scanner(System.in);
        String str = "AbaZ";

        int diff = 'a' - 'A';
        System.out.println(diff);

        System.out.println(toLowerCase(str));
        System.out.println(toLower(str));
    }
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static String toLower(String str) {
        int diff = 'a' - 'A';
        char[] chars = new char[str.length()];
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c < 97) {
                chars[i++] = (char) (c + diff);
            } else {
                chars[i++] = c;
            }
        }
        return new String(chars);
    }
}

