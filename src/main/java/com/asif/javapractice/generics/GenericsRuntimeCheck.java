package com.asif.javapractice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {
    public static void main(String[] args) {
        /**
         * generics is compile-time construct
         */
        List<String> names = new ArrayList<>();
        addToNames(names, "name 1");
        addToNames(names, "name 1");
        System.out.println(names);

        incorrectAddToNames(names, 10);
        System.out.println(names);
        // String name = names.get(2); // will give "ClassCastException" at runtime

        /**
         * array is runtime construct
         */
        String[] namesArray = new String[5];
        addToArray(namesArray, "array name 1");
        incorrectAddToArray(namesArray, 10);
        String anotherName = namesArray[0];
    }

    private static void addToArray(String[] namesArray, String s) {
        namesArray[0] = s;
    }
    private static void incorrectAddToArray(Object[] namesArray, Integer s) {
        namesArray[0] = s; // will give ArrayStoreException at runtime
    }

    private static void addToNames(List<String> names, String s) {
        names.add(s);
    }
    private static void incorrectAddToNames(List list, Integer s) {
        list.add(s);
    }
}
