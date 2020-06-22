package com.dsalgo.algo.search;

/**
 * Time Complexity: O(n)
 */
public class LinearSearch {

    public int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    private int recursiveSearch(int[] arr, int index, int x) {
        if (arr.length == index) return -1;

        if (arr[index] == x) return index;

        return recursiveSearch(arr, index + 1, x);
    }

    public int recursiveSearch(int[] arr, int x) {
        return recursiveSearch(arr, 0, x);
    }
}
