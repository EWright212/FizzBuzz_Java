package com.gradle.fizzbuzzpackage;

public class FizzBuzzCreator {

    public String generate(int i) {
        if(i % 3 == 0){
            return "Fizz";
        }else{
            return Integer.toString(i);
        }
    }
}
