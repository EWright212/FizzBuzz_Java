package com.gradle.fizzbuzzpackage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void FizzBuzzTestNumbers() {
        FizzBuzzCreator fizzbuzz = new FizzBuzzCreator();
        assertEquals("1", fizzbuzz.generate(1));
    }
}