package com.company;

import java.util.Arrays;

public class MergeSortRecursion {

    private int MAX = 100;

    public void mergeSort(int []arr, int low, int up ) {

        int mid;
        int []tempArray = new int[MAX];
        if(low < up ) {
            mid = (low + up)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid +1, up);
            mergeArray(arr,tempArray,low, mid, mid+1, up);
            copy(arr, tempArray, low, up);
        }
    }

    private void copy(int[] arr, int[] tempArray, int low, int up) {
        for ( int i = low ; i <= up ; i++) {
            arr[i] = tempArray[i];
        }
    }

    public void mergeArray( int[] arr, int[] temp, int low1, int low2, int up1, int up2  ) {

        int i = low1;
        int j = low2;
        int k = low1;
        while(i<=up1 && j<=up2) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while( i <=up1) {
            temp[k++] = arr[i++];
        }
        while( j <=up2) {
            temp[k++] = arr[j++];
        }
    }

    public static void main(String[] args) {
        MergeSortRecursion recursion = new MergeSortRecursion();
        int[] arr = new int[]{82, 42, 49, 8, 26};
                recursion.mergeSort(arr, 0, 4);
        Arrays.stream(arr).forEach(System.out::println);

    }
}
