package com.dsalgo.algo.misc;

public class SingleNumber {
    
    public static int findUniqueNumber(int[] nums) {

        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}