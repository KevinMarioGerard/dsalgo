package com.dsalgo.ds.array.rotations;

import com.dsalgo.util.MathUtil;

public class ArrayRotation {

    /**
     * Left rotate one by one
     * Time complexity: O(n * m)
     * Auxiliary space: O(1)
     * @param arr - array
     * @param m - number of rotations
     */
    public static void rotate(int[] arr, int m) {
        if (arr.length == 0) return;

        for (int i = 0; i < m; i++) {
            int temp = arr[0];
            
            for (int j = 0; j + 1 < arr.length; j++) {
                arr[j] = arr[j + 1];
            }
            
            arr[arr.length - 1] = temp;
        }
    }

    /**
     * Juggling Algorithm
     * Time complexity: O(n)
     * Auxiliary space: O(1)
     * @param arr - array
     * @param m - number of rotations
     */
    public static void juggle(int[] arr, int m) {
        if (arr.length == 0) return;

        m = m % arr.length;

        int gcd = MathUtil.gcd(m, arr.length);

        for (int i = 0; i < gcd; i++) {
            int temp = arr[i], prev = i;

            while (true) {
                int curr = prev + m;

                if (curr >= arr.length) curr -= arr.length;
                if (curr == i) break;
                arr[prev] = arr[curr];
                prev = curr;
            }
            arr[prev] = temp;
        }
    }
}