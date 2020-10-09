package com.company.string;

public class ReverseString {


    public static void main(String[] args) {
        System.out.println(reverseString("i.like.this.program.very.much"));
        String s = "2123";
        int sum = 0;
        sum += Integer.parseInt(String.valueOf(s.charAt(0)));
        System.out.println(sum);
    }

    static String reverseString(String s){
        String[] strs = s.split("\\.");
        for(int i = 0, j= strs.length-1 ; i < j; i++,j--) {
            String temp = strs[j];
            strs[j] = strs[i];
            strs[i] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < strs.length ; i++){
            if(i<strs.length-1)
                sb.append(strs[i]).append(".");
            else
                sb.append(strs[i]);

        }
        return sb.toString();
    }
}
