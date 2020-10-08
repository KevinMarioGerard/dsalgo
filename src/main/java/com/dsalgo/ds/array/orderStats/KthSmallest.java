package com.dsalgo.ds.array.orderStats;

import java.util.Arrays;

/**
 * Time Complexity: O(nlogn)
 * Kth smallest element in given array
 */
public class KthSmallest {
    
    public static int findKthSmallest(int[] arr, int k) {
        if (arr.length < k) return -1;

        Arrays.sort(arr);

        return arr[k - 1];
    }
}