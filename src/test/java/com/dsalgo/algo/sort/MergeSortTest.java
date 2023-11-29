package com.dsalgo.algo.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    private MergeSort sortAlgo = new MergeSort();

    @Test void testUnsortedArrayEvenLength() {
        int[] arr = { 15, 19, 41, 22, -8, 2, 1, -41 };

        sortAlgo.sort(arr);

        Assertions.assertArrayEquals(arr, new int[]{ -41, -8, 1, 2, 15, 19, 22, 41 });
    }

    @Test void testUnsortedArrayOddLength() {
        int[] arr = { 15, 19, 41, 22, -8, 2, 1, -41, 27 };

        sortAlgo.sort(arr);

        Assertions.assertArrayEquals(arr, new int[]{ -41, -8, 1, 2, 15, 19, 22, 27, 41 });
    }

    @Test void testUnsortedArrayWithDuplicates() {
        int[] arr = { 15, 41, 41, 22, 2, 2, 1, -41, 42 };

        sortAlgo.sort(arr);

        Assertions.assertArrayEquals(arr, new int[]{ -41, 1, 2, 2, 15, 22, 41, 41, 42 });
    }

    @Test void testSortedArray() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        sortAlgo.sort(arr);

        Assertions.assertArrayEquals(arr, new int[]{ 1, 2, 3, 4, 5, 6, 7, 8 });
    }
}
