package com.gradle.fizzbuzzpackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {
    private FizzBuzzCreator fizzbuzz = new FizzBuzzCreator();

    @Test
    public void FizzBuzzTestNumbers() {
        assertEquals("1", fizzbuzz.generate(1));
        assertEquals("4", fizzbuzz.generate(4));
    }

    @Test
    public void testMultiplesOfThree() {
        assertEquals("Fizz", fizzbuzz.generate(3));
        assertEquals("Fizz", fizzbuzz.generate(6));
        assertEquals("Fizz", fizzbuzz.generate(27));
    }

    @Test
    public void testFive() {
        assertEquals("Buzz", fizzbuzz.generate(5));
        assertEquals("Buzz", fizzbuzz.generate(10));
        assertEquals("Buzz", fizzbuzz.generate(20));
    }

    @Test
    public void testFifteen() {
        assertEquals("FizzBuzz", fizzbuzz.generate(15));
        assertEquals("FizzBuzz", fizzbuzz.generate(30));
    }
}