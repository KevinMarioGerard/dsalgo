package com.dsalgo.algo.search;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LinearSearchTest {

    private LinearSearch linear = new LinearSearch();

    @Test void testLinearSearch() {
        int[] arr = { 6, 4, 2, 3, 11, 13, 1 };

        assertThat(linear.search(arr, 11)).isEqualTo(4);
    }

    @Test void testUnavailableElement() {
        int[] arr = { 6, 4, 2, 3, 11, 13, 1 };

        assertThat(linear.search(arr, 40)).isEqualTo(-1);
    }
}
