package com.company;

public class FindFirstPositiveMissingNumber {


    // function to find first positive missing number
    static int missingNumber(int arr[], int size)
    {

        // Your code here
        // You can add utility functions (if required)
        for(int i = 0 ; i <size-1 ; i++) {
            if(arr[i] <= 0) {
                continue;
            } else if(arr[i+1]-arr[i]==1) {
                continue;
            } else if (arr[i+1]-arr[i]!=1){
                return arr[i]+1;
            }
        }
        if(arr[size-1]-arr[size-2] != 1){
            return arr[size-2] +1;
        } else {
            return arr[size-1]+1;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{0, -10, 1, 3, -20};
        System.out.println(missingNumber(a,5));
        //System.out.println(missingNumber(b,5));
    }
}
