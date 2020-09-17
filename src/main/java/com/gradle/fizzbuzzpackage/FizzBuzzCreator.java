package com.gradle.fizzbuzzpackage;

public class FizzBuzzCreator {

    public String generate(int i) {

        String output = new String("");
        if (i % 3 == 0) {
            output += "Fizz";
        }
        if (i % 5 == 0) {
            output += "Buzz";
        }
        if ( output.isEmpty() ){
            output = Integer.toString(i);
        }
        return output;
    }
}
