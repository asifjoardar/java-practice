package com.asif.javapractice.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printNumbers(integers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(3.0);
        doubles.add(4.0);
        printNumbers(doubles);

        List<Number> numbers = new ArrayList<>();
        addToList(numbers, 10);
    }

    private static void addToList(List<? super Number> numbers, Number i) {
        numbers.add(i);
    }

    private static void printNumbers(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
        Number number = numbers.get(0);
    }
}
