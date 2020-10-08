package com.dsalgo.ds.array.sorting;

import java.util.Arrays;

/**
 * smallest, largest, 2nd smallest, 2nd largest, ...
 * Time Complexity: O(nlogn)
 */
public class AlternativeSorting {
    
    public static int[] sort(int[] arr) {
        Arrays.sort(arr);

        int[] output = new int[arr.length];

        int i = 0;
        int j = arr.length - 1;

        for (int k = 0; k + 1 < arr.length; k += 2) {
            output[k] = arr[i++];
            output[k + 1] = arr[j--];
        }

        if (arr.length % 2 == 1)
            output[output.length - 1] = arr[i];
            
        return output;
    }
}