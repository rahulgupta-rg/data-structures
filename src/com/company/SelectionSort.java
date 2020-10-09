package com.company;

import java.util.Arrays;

public class SelectionSort {

    public int[] selectionSort(int[] nums) {
        for ( int i = 0 ;i < nums.length -1 ; i++ ) {

            for ( int j = i+1 ; j < nums.length ; j++ ) {
                if (nums[j] < nums[i] ) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        Arrays.stream(new SelectionSort().selectionSort(new int[]{82, 42, 49, 8, 26}))
                .forEach(System.out::println);

    }
}
