package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * created by divya at 7/15/2018
 */
public class anagram_mappings {
    public static void main(String args[]) {


        int[] a = {12, 24, 34, 26, 27};
        int[] b = {24,12,26,27,34};
        System.out.println(find_anagram(a,b));
    }

    private static int[] find_anagram(int[] a, int[] b) {
        if (a == null || b == null){
            return null;
        }
        Map<Integer,Integer> map =new HashMap<Integer, Integer>();
        for (int i=0; i<b.length;i++){
            map.put(b[i],i);
        }
        int[] result =new int[a.length];
        for(int i=0; i<a.length;i++){
           if(map.containsKey(a[i])){
               result[i] = map.get(a[i]);
           }
        }
        return result;
    }
}
