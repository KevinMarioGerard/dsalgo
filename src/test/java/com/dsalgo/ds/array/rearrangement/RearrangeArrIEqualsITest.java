package com.dsalgo.ds.array.rearrangement;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class RearrangeArrIEqualsITest {
    
    @Test void rearrange() {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        RearrangeArrIEqualsI.rearrange(arr);
        
        assertThat(Arrays.toString(arr)).isEqualTo("[-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]");
    }

    @Test void swapRearrange() {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        RearrangeArrIEqualsI.swapRearrage(arr);
        
        assertThat(Arrays.toString(arr)).isEqualTo("[-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]");
    }
}