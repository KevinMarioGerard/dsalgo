package com.dsalgo.algo.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

    private SelectionSort selection = new SelectionSort();

    @Test void testUnsortedArray() {
        int[] arr = { 15, 19, 41, 22, -8, 2, 1, -41 };

        selection.sort(arr);

        Assertions.assertArrayEquals(arr, new int[]{ -41, -8, 1, 2, 15, 19, 22, 41 });
    }

    @Test void testSortedArray() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        selection.sort(arr);

        Assertions.assertArrayEquals(arr, new int[]{ 1, 2, 3, 4, 5, 6, 7, 8 });
    }
}
