package com.dsalgo.algo.sort;

import java.util.Arrays;

/**
 * Recursive algo where the array is broken continuously in the middle and merged back in sorted form.
 * Time Complexity: O(n*log(n))
 */
public class MergeSort {
    private void merge(int[] arr, int left, int right, int mid) {
        int[] temp1 = new int[mid - left + 1];
        int[] temp2 = new int[right - mid];

        for (int i = left, j = 0; i <= mid; i++, j++) {
            temp1[j] = arr[i];
        }

        for (int i = mid + 1, j = 0; i <= right; i++, j++) {
            temp2[j] = arr[i];
        }

        System.out.println("Temp1: " + Arrays.toString(temp1));
        System.out.println("Temp2: " + Arrays.toString(temp2));

        int index1 = 0, index2 = 0, index = left;

        while (index1 < temp1.length && index2 < temp2.length) {
            if (temp1[index1] > temp2[index2]) {
                arr[index] = temp2[index2++];
            } else {
                arr[index] = temp1[index1++];
            }

            index++;
        }

        while (index1 < temp1.length) {
            arr[index++] = temp1[index1++];
        }

        while (index2 < temp2.length) {
            arr[index++] = temp2[index2++];
        }

        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, right, mid);
        }
    }
    
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

}
