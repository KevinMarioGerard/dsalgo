package com.dsalgo.algo.dp;

/**
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
 * The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
 * 
 * Time Complexity: O(n)
 * Auxiliary Space: O(n)
 */
public class UglyNumbers {
    
    public static int getNthUgly(int n) {
        int[] ugly = new int[n];

        int i2 = 0, i3 = 0, i5 = 0;
        int mul2 = 2, mul3 = 3, mul5 = 5;
        int nextUglyN = 1;

        ugly[0] = nextUglyN;

        for (int i = 1; i < n; i++) {
            nextUglyN = mul2 < mul3 ? (mul2 < mul5 ? mul2 : mul5) : (mul3 < mul5 ? mul3 : mul5);

            ugly[i] = nextUglyN;

            if (nextUglyN == mul2) {
                mul2 = ugly[++i2] * 2;
            } 
            if (nextUglyN == mul3) {
                mul3 = ugly[++i3] * 3;
            } 
            if (nextUglyN == mul5) {
                mul5 = ugly[++i5] * 5;
            }
        }

        return nextUglyN;
    }
}