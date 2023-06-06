package com.asif.javapractice.collectionFramwork.collection.list;

import java.util.Stack;

public class StackExmpl {
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();

        animals.push("lion");
        animals.push("dog");
        animals.push("horse");
        animals.push("cat");

        System.out.println(animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println(animals.peek());

        System.out.println(animals);
    }
}

/**
 * [lion, dog, horse, cat]
 * cat
 * horse
 * [lion, dog, horse]
 */