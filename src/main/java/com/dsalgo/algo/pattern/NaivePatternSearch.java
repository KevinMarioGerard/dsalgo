package com.dsalgo.algo.pattern;

/**
 * 
 * Counts the total number of occurences of a pattern in text
 *
 */
public class NaivePatternSearch {
    
    public static int search(String pattern, String text) {
        if (text.length() == 0 || pattern.length() == 0) {
            return 0;
        }

        int occurences = 0;

        for (int i = 0; i < text.length(); i++) {

            // For current index i in text check if there is a possible pattern match
            for (int j = 0; true; j++) {
                if (j == pattern.length()) {
                    occurences++;
                    break;
                } else if (i + j == text.length() || text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
        }

        return occurences;
    }
}