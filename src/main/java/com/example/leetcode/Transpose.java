package com.example.leetcode;

import java.util.Scanner;

/*
 * created by divya at 7/19/2018
 */
public class Transpose {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] multi = new int[][] {{1,2,3},{4,5,6},{7,8,9}};


        System.out.println(get_transpose(multi) );
    }

    private static int[][] get_transpose(int[][] multi) {
        int R =multi.length;
        int C= multi[0].length;
        int[][] ans = new int[R][C];
        for(int r=0;r < R; r++){
            for(int c=0;c<C;c++){
                ans[r][c]=multi[c][r];
            }
        }
        return ans;
    }

}
