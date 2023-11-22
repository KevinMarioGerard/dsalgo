package com.dsalgo.algo.sort;

import java.util.Arrays;

/**
 * The array is virtually split into a sorted and an unsorted part
 * Values from the unsorted part are picked and placed at the correct position in the sorted part
 * Time Complexity: O(n*n)
 * Auxiliary Space: O(1)
 */
public class InsertionSort {

    public void sort(int[] arr) {
        
        for (int i = 1; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));

            int insertEl = arr[i];

            int j = i - 1;
            for (; j >= 0 && arr[j] > insertEl; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = insertEl;
        }
    }
}
