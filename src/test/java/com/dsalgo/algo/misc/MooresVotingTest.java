package com.dsalgo.algo.misc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MooresVotingTest {
    @Test void testMooresVotingAlgo() {
        int[] arr = { 1, 2, 3, 4, 4, 3, 3, 3, 3 };
		
	    assertEquals(MooresVoting.findMajorityElement(arr), 3);
	}

    @Test void testMooresVotingAlgoSingleEl() {
        int[] arr = { 1 };
		
	    assertEquals(MooresVoting.findMajorityElement(arr), 1);
	}

    
}