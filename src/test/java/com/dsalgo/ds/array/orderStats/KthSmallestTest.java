package com.dsalgo.ds.array.orderStats;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

public class KthSmallestTest {
    
    @Test void kthSmallestTest() {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        
        assertThat(KthSmallest.findKthSmallest(arr, 7)).isEqualTo(4);
    }

    @Test void outOfRangeKTest() {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        
        assertThat(KthSmallest.findKthSmallest(arr, 27)).isEqualTo(-1);
    }
}