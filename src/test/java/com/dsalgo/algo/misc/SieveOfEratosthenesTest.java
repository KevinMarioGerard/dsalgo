package com.dsalgo.algo.misc;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SieveOfEratosthenesTest {

    @Test void testSieveOfEratosthenes() {
        SieveOfEratosthenes sieve = new SieveOfEratosthenes(1000);
		
	    assertFalse(sieve.isPrime(10));
		assertTrue(sieve.isPrime(17));
		assertTrue(sieve.isPrime(13));
		assertFalse(sieve.isPrime(39));
        assertTrue(sieve.isPrime(431));
    }
}