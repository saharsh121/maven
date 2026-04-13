package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPrimeNumbers() {
        // Prime numbers
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(3));
        assertTrue(App.isPrime(5));
        assertTrue(App.isPrime(97));

        // Non-prime numbers
        assertFalse(App.isPrime(1));
        assertFalse(App.isPrime(4));
        assertFalse(App.isPrime(10));
        assertFalse(App.isPrime(100));
    }
}
