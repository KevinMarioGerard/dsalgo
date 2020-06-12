package com.dsalgo.algo.search;

/**
 * Time Complexity: O(log n)
 * Applicable only for sorted arrays.
 */
public class BinarySearch {

    public int search(int[] arr, int x) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return -1;
    }

    public int recursiveSearch(int[] arr, int i, int j, int x) {
        if (i > j) return -1;

        int mid = (i + j) / 2;
        
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return recursiveSearch(arr, i, mid - 1, x);
        } else {
            return recursiveSearch(arr, mid + 1, j, x);
        }
    }
    
}