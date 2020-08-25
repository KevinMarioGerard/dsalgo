package com.dsalgo.ds.string;

/**
 * Find length of longest substring with unique characters
 */
public class LongestSubstring {

    /**
     * Window Slide
     * Time Complexity: O(n^2)
     * @param str - input string
     * @return - maximum length of substring
     */
    public static int getLengthSubstrSlide(String str) {
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean[] visited = new boolean[256];

            for (int j = i; j < str.length(); j++) {
                if (visited[(int) str.charAt(j)]) {
                    break;
                } else {
                    visited[(int) str.charAt(j)] = true;
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
}