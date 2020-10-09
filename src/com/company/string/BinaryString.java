package com.company.string;

public class BinaryString {

    static int countBinaryString(String s){
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i)!='1'){
                continue;
            }
            for(int j = i+1 ; j <s.length() ; j++) {
                    if(s.charAt(j)=='1'){
                        count++;
                    }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBinaryString("00100101"));
        //System.out.println(countBinaryString("1111"));
        //System.out.println(countBinaryString("01101"));
        System.out.println(countBinaryString("01000"));
    }
}
