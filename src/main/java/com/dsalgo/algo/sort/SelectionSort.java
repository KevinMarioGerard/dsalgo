package com.dsalgo.algo.sort;

import java.util.Arrays;

import com.dsalgo.util.ArrayUtil;

/**
 * The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first element of the unsorted part. 
 * This process is repeated for the remaining unsorted portion until the entire list is sorted. 
 * Time Complexity: O(n*n)
 * Auxiliary Space: O(1)
 */
public class SelectionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            System.out.println(Arrays.toString(arr));
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            ArrayUtil.swap(arr, i, min);
        }
    }
}
