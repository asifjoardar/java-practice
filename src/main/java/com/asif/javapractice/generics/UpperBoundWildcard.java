package com.asif.javapractice.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printNumbers(numbers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(3.0);
        doubles.add(4.0);
        printNumbers(doubles);

        /*List<String> foo = new ArrayList<>();
        printNumbers(foo);*/
    }

    private static void printNumbers(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
        Number number = numbers.get(0);
    }
}
