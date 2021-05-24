package com.dsalgo.algo.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NaivePatternSearchTest {
    
    @Test void testNaivePatternSearch() {
        assertEquals(3, NaivePatternSearch.search("AABA", "AABAACAADAABAABA"));
    }

    @Test void testPatternGTText() {
        assertEquals(0, NaivePatternSearch.search("AABAASJKFJAKSNJSFKNKAABAACAADAABAABA", "AABAACAADAABAABA"));
    }
}