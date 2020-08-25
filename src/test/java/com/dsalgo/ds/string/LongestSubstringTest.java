package com.dsalgo.ds.string;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

public class LongestSubstringTest {

    @Test void testWindowSlide() {
        assertThat(LongestSubstring.getLengthSubstrSlide("abcabcbb")).isEqualTo(3);
        assertThat(LongestSubstring.getLengthSubstrSlide("bbbb")).isEqualTo(1);
        assertThat(LongestSubstring.getLengthSubstrSlide("pwwkew")).isEqualTo(3);
    }
}