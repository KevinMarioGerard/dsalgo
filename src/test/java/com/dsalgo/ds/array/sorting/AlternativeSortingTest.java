package com.dsalgo.ds.array.sorting;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class AlternativeSortingTest {
    
    @Test void sortOddLength() {
        int arr[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};

        arr = AlternativeSorting.sort(arr);
        
        assertThat(Arrays.toString(arr)).isEqualTo("[1, 9, 2, 8, 3, 7, 4, 6, 5]");
    }

    @Test void sortEvenLength() {
        int arr[] = {5, 8, 1, 4, 2, 9, 3, 7, 6, 10};

        arr = AlternativeSorting.sort(arr);
        
        assertThat(Arrays.toString(arr)).isEqualTo("[1, 10, 2, 9, 3, 8, 4, 7, 5, 6]");
    }
}