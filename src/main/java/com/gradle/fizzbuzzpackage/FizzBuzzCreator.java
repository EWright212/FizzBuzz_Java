package com.gradle.fizzbuzzpackage;

public class FizzBuzzCreator {

    public String generate(int i) {

        String output = new String("");
        if (i % 15 == 0) {
            output +=  "FizzBuzz";
        } else if (i % 3 == 0) {
            output += "Fizz";
        } else if (i % 5 == 0) {
            output += "Buzz";
        } else {
            output = Integer.toString(i);
        }
        return output;
    }
}
