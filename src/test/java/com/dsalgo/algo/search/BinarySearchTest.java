package com.dsalgo.algo.search;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    private BinarySearch binary = new BinarySearch();

    @Test void testBinarySearch() {
        int[] arr = { 1, 2, 3, 4, 11, 12, 20 };

        assertThat(binary.search(arr, 12)).isEqualTo(5);
        assertThat(binary.search(arr, 1)).isEqualTo(0);
        assertThat(binary.search(arr, 20)).isEqualTo(6);
    }
    
    @Test void testUnavailableElement() {
        int[] arr = { 2, 3, 4, 11, 12, 20 };

        assertThat(binary.search(arr, 1)).isEqualTo(-1);
        assertThat(binary.recursiveSearch(arr, 0, arr.length - 1, 1)).isEqualTo(-1);
    }

    @Test void testRecursiveBinarySearch() {
        int[] arr = { 1, 2, 3, 4, 11, 12, 20 };

        assertThat(binary.recursiveSearch(arr, 0, arr.length - 1, 12)).isEqualTo(5);
        assertThat(binary.recursiveSearch(arr, 0, arr.length - 1, 1)).isEqualTo(0);
        assertThat(binary.recursiveSearch(arr, 0, arr.length - 1, 20)).isEqualTo(6);
    }
}