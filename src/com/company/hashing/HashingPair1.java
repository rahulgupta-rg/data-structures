
package com.company.hashing;

import java.util.Objects;

public class HashingPair1 {

    static Pair getPair(int []arr, int x) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            if(arr[start] + arr[end]==x) {
                return new Pair(start, end);
            } else if(arr[start] + arr[end] <x) {
                start++;
            } else {
                end++;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] arr= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Pair pair = getPair(arr, 14);
        if(Objects.nonNull(pair)){
            System.out.println(pair.start +" "+pair.end);
        } else {
            System.out.println("No such pair existed");
        }

    }
}
class Pair{

    int start;
    int end;

    Pair(int x, int y){
        start = x;
        end = y;
    }
}
