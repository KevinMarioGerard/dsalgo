package com.dsalgo.ds.array.rotations;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class ArrayRotationTest {
    
    @Test void testArrayRotation() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        ArrayRotation.rotate(arr1, 3);
        
        assertThat(Arrays.toString(arr1)).isEqualTo("[4, 5, 6, 7, 8, 9, 1, 2, 3]");

        int[] arr2 = {1};

        ArrayRotation.rotate(arr2, 20);

        assertThat(Arrays.toString(arr2)).isEqualTo("[1]");
    }

    @Test void testEmptyArrayRotation() {
        int[] arr = new int[0];

        ArrayRotation.rotate(arr, 3);
        
        assertThat(Arrays.toString(arr)).isEqualTo("[]");
    }

    @Test void testArrayRotationJugglingAlgo() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        ArrayRotation.juggle(arr1, 12);
        
        assertThat(Arrays.toString(arr1)).isEqualTo("[4, 5, 6, 7, 8, 9, 1, 2, 3]");

        int[] arr2 = {1};

        ArrayRotation.juggle(arr2, 20);

        assertThat(Arrays.toString(arr2)).isEqualTo("[1]");
    }

    @Test void testEmptyArrayRotationJugglingAlgo() {
        int[] arr = new int[0];

        ArrayRotation.juggle(arr, 3);
        
        assertThat(Arrays.toString(arr)).isEqualTo("[]");
    }

    @Test void testArrayRotationReversalAlgo() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        ArrayRotation.reversal(arr1, 4);
        
        assertThat(Arrays.toString(arr1)).isEqualTo("[5, 6, 7, 8, 9, 1, 2, 3, 4]");

        int[] arr2 = {1};

        ArrayRotation.juggle(arr2, 20);

        assertThat(Arrays.toString(arr2)).isEqualTo("[1]");
    }

    @Test void testEmptyArrayRotationReversalAlgo() {
        int[] arr = new int[0];

        ArrayRotation.reversal(arr, 3);
        
        assertThat(Arrays.toString(arr)).isEqualTo("[]");
    }
}