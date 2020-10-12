package com.dsalgo.algo.misc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

    @Test void testFindNumber() {
        int[] nums = {-1, -2, -3, 2, 2, -2, 4, -1, -3};
        
	    assertEquals(SingleNumber.findUniqueNumber(nums), 4);
    }
}