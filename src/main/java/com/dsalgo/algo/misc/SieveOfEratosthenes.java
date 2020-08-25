package com.dsalgo.algo.misc;

import java.util.Arrays;

/**
 * 
 * Finding All prime numbers up to a given limit n.
 *
 */
public class SieveOfEratosthenes {
	private boolean[] sieve;
	
	SieveOfEratosthenes(int n) {
		sieve = new boolean[n + 1];
		constructSieve();
	}
	
	private void constructSieve() {
		Arrays.fill(sieve, true);
		sieve[0] = false;
		sieve[1] = false;
		
		for (int i = 2; i * i < sieve.length; i++) {
			if (sieve[i] == true) {
				for(int j = i * i; j < sieve.length; j += i) {
					sieve[j] = false;
				}
			}
		}
	}
	
	public boolean isPrime(int num) {
		if (num >= sieve.length) {
			throw new IllegalArgumentException("Sieve limit: " + (sieve.length - 1));
		}
		return sieve[num];
	} 
}