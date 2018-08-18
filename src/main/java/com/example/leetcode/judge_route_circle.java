package com.example.leetcode;

import java.util.Scanner;

/*
 * created by divya at 7/16/2018
 */
public class judge_route_circle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String moves = in.nextLine();


        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int v =0;
        int h=0;
        for(char ch: moves.toCharArray()){
            switch (ch){
                case 'U': v++; break;
                case 'D': v--; break;
                case 'R': h++; break;
                case 'L': h--; break;
                default: break;
            }
        }
        if ((v==0) && (h==0)){
            return true;
        } else {
            return false;
        }
    }

}
