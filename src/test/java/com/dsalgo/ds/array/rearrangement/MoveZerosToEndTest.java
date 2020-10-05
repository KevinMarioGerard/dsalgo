package com.dsalgo.ds.array.rearrangement;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class MoveZerosToEndTest {
    
    @Test void moveZerosToEnd() {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        MoveZerosToEnd.pushZero(arr);
        
        assertThat(Arrays.toString(arr)).isEqualTo("[1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0]");
    }
}