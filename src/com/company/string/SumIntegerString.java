package com.company.string;

public class SumIntegerString {


    public static void main(String[] args) {
        sumOfInegerInString("1abc2x30yz673");
    }

    private static  void sumOfInegerInString(String s) {

        long ans=0;
        for(int i=0;i<s.length();){
            int num=0;
            while(i<s.length()&& (s.charAt(i)>=48&&s.charAt(i)<=57)){
                num=num*10+Character.getNumericValue(s.charAt(i));
                i++;
            }
            ans=ans+num;
            if(num==0){
                i++;
            }

        }
        System.out.println(ans);

    }
}
