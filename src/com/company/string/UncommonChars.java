package com.company.string;

import java.util.Arrays;

/*Remove common characters and concatenate
Given two strings s1 and s2. Modify string s1 such that all the common characters of s1 and s2 is to be removed and the
 ncommon characters of s1 and s2 is to be concatenated.

Note: If no modification is possible print -1.*/
public class UncommonChars {

    static String uncommonChars(String f, String s) {
        int []cf = new int[256];
        int []cs = new int[256];
        Arrays.fill(cf, -1);
        Arrays.fill(cs, -1);
        for(int i  = 0 ; i < f.length() ; i++) {
            cf[f.charAt(i)]++;
        }
        for(int i  = 0 ; i < s.length() ; i++) {
            cs[s.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<256 ; i++) {
            if(cf[i]>=0 && cs[i]<0){
                sb.append((char)i);
            }
            if(cf[i]<0 && cs[i]>=0){
                sb.append((char)i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println(uncommonChars("aacdb", "gafd"));
        //System.out.println(uncommonChars("abcs", "cxzca"));
        System.out.println(uncommonChars("dkusgfqwniwcbefkpkujoveawvtrmfossimypcxemtgqxnapywaoseq", "ockiqpwijgu"));
    }
}
