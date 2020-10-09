package com.company;

import java.util.Arrays;

public class QuickSortDemo {

    public void sort(int[] num, int start, int end) {
        if(start < end ) {
            int partitionIndex = partition(num, start, end);
            sort(num, start, partitionIndex -1);
            sort(num, partitionIndex+1, end );
        }

    }

    public int partition ( int[] arr, int start,int end ) {
        int pivot = arr[end];
        int pivotIndex = start;
        for (int i = start ; i<end ; i++) {
            if (arr[i] <= pivot ) {
                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = temp;
                pivotIndex++;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        arr[end] = temp;
        return pivotIndex;
    }

    public static void main(String[] args) {
        QuickSortDemo quickSortDemo = new QuickSortDemo();
        int[] arr = new int[]{82, 42, 49, 8, 26};
        quickSortDemo.sort(arr, 0, 4);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
