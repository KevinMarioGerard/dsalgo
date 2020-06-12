package com.dsalgo.algo.sort;

import com.dsalgo.util.ArrayUtil;

import java.util.Arrays;

/**
 * Time Complexity: O(n*n)
 * Best Case Time Complexity: O(n) (Already Sorted Array)
 * Auxiliary Space: O(1)
 */
public class BubbleSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                System.out.println(Arrays.toString(arr));

                if (arr[j] > arr[j + 1]) {
                    ArrayUtil.swap(arr, j, j + 1);
                }
            }
        }
    }

    // Stopping the algorithm if inner loop didn’t cause any swap.
    public void optimizedSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                System.out.println(Arrays.toString(arr));

                if (arr[j] > arr[j + 1]) {
                    ArrayUtil.swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
