package com.company.string;

public class ModifyNumber {

    static int modifyString(String s) {
        if(s.length() <3) {
            return 0;
        }
        int count = 0;
        for(int  i = 0 ; i < s.length()-2 ; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            char third = s.charAt(i+2);
            if(first==second && second == third) {
                count++;
                //i = i+2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(modifyString("aaaaa"));
    }

}
