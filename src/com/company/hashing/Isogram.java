package com.company.hashing;

import java.util.HashSet;

public class Isogram {

    static boolean isIsogram(String str) {
        boolean arr[] = new boolean[256];
        for(int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if(arr[c-'a']) {
                return false;
            } else {
                arr[c-'a'] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("machine"));
    }
}
