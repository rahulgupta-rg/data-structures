package com.company.string;

import java.util.Arrays;
import java.util.Stack;

public class Anagrams {

    static void isAnagram(String s1, String s2){
        int[] chars = new int[256];
        if(s1.length()!=s2.length()){
            System.out.println("NO");
            return;
        }
        for(int i = 0; i < s1.length() ; i++){
            chars[s1.charAt(i)]++;
        }
        for(int i = 0; i < s2.length() ; i++){
            chars[s2.charAt(i)]--;
        }
        for(int i = 0; i < 256 ; i++){
            if(chars[i]>0){
                System.out.println("NO");
               return;
            }
        }
        System.out.println("YES");
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < digits.length ; i++) {
            sb.append(digits[i]);
        }
        long num = Long.parseLong(sb.toString());
        num++;
        Stack<Integer> st = new Stack<>();
        while(num>0){
            st.push(Math.toIntExact(num % 10));
            num=num/10;
        }
        int[] arr = new int[st.size()];
        for(int i = 0 ; i <arr.length ; i++) {
            arr[i] = st.pop();
        }
        return arr;
    }

    public static void main(String[] args) {
        //isAnagram("geeksforgeeks", "geeksforgeeks");
        //isAnagram("allergy", "allergx");
       /* long lo = Long.parseLong("9876543210");
        lo++;
        System.out.println(lo);*/
        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }
}
