package com.company.arrays;

public class Main {

    int maxSubarraySum(int arr[], int n){
        int maxSum = 0;
        int maxSumSoFar = 0;
        for(int i = 0;i<n;i++){

            maxSumSoFar +=arr[i];
            if(maxSumSoFar<0){
                maxSumSoFar = 0;
            }
            maxSum = Math.max(maxSum, maxSumSoFar);

        }
        return maxSum;
    }

}