package com.dsalgo.algo.sort;

import com.dsalgo.util.ArrayUtil;

import java.util.Arrays;

public class SelectionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            System.out.println(Arrays.toString(arr));

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            ArrayUtil.swap(arr, i, min);
        }
    }
}
