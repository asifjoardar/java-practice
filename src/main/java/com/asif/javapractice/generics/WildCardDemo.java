package com.asif.javapractice.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("name 1");
        names.add("name 2");
        printList(names); // will not work

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printList(numbers); // will not work
    }

    private static void printList(List<?> names) {
        names.forEach(System.out::println);
        // Object x = names.get(0); // will work, act as an object
        // names.add("bla"); // will not work, it can't be modified
    }
}
