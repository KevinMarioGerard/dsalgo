package com.dsalgo.algo.sort;

import java.util.Arrays;

import com.dsalgo.util.ArrayUtil;

/**
 * Divide and Conquer algorithm that picks an element as a pivot and 
 * partitions the given array around the picked pivot by placing the 
 * pivot in its correct position in the sorted array
 * Time Complexity: O(n*log(n)) for average and O(n*n) for worst case
 */
public class QuickSort {
    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end], pivotIndex = start;

        System.out.println("Pivot: " + pivot);

        for (int i = start; i < end; i++) {
            if (pivot > arr[i]) {
                ArrayUtil.swap(arr, pivotIndex++, i);
            }
        }

        ArrayUtil.swap(arr, pivotIndex, end);

        System.out.println(Arrays.toString(arr));

        return pivotIndex;
    }

    private void sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);

            sort(arr, start, pivotIndex - 1);
            sort(arr, pivotIndex + 1, end);
        }
    }
    
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

}
