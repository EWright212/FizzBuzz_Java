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
    public void FizzBuzzTestThree() {
        assertEquals("Fizz", fizzbuzz.generate(3));
    }
}