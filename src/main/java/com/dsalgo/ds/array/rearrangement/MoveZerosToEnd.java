package com.dsalgo.ds.array.rearrangement;

import com.dsalgo.util.ArrayUtil;

/**
 * Time Complexity: O(n)
 * Input: 1 9 8 4 0 0 2 7 0 6 0 9
 * Output: 1 9 8 4 2 7 6 9 0 0 0 0
 */
public class MoveZerosToEnd {
    
    public static void pushZero(int[] arr) {
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[index++] = arr[i];
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void singleTraversal(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                ArrayUtil.swap(arr, i, nonZeroIndex++);
        }
    }
}