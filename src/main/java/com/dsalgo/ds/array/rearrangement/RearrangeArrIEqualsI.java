package com.dsalgo.ds.array.rearrangement;

import java.util.HashSet;
import java.util.Set;

import com.dsalgo.util.ArrayUtil;

/**
 * Rearrange an array such that arr[i] = i
 */
public class RearrangeArrIEqualsI {
    
    public static void rearrange(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(i)) 
                arr[i] = -1;
            else
                arr[i] = i;
        }
    }

    /**
     * Time Complexity: O(n)
     * @param arr
     */
    public static void swapRearrage(int[] arr) {
        for (int i = 0; i < arr.length;) {
            if (arr[i] >= 0 && arr[i] != i) {
                ArrayUtil.swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }
}