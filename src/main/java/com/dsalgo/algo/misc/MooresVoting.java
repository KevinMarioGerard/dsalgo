package com.dsalgo.algo.misc;

/**
 * Find number occuring more than n/2 times in an array
 * 
 * Time Complexity: O(n)
 * Auxiliary Space: O(1)
 */
public class MooresVoting {
    
    public static int findMajorityElement(int[] arr) {
        int majElIndex = 0, count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[majElIndex]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majElIndex = i;
                count = 1;
            }
        }

        return arr[majElIndex];
    }
}