package com.asif.javapractice.collectionFramwork.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExmple {
    public static void main(String[] args){
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("one", 1);
        numbers.put("two", 5);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("two", 2);

        System.out.println(numbers);

        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
/**
 * {four=4, one=1, three=3, two=2}
 * four=4
 * four
 * 4
 * one=1
 * one
 * 1
 * three=3
 * three
 * 3
 * two=2
 * two
 * 2
 */