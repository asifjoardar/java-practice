package com.asif.javapractice.collectionFramwork;

import java.util.Arrays;

public class ArraysClassExmple {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println(index);

        int[] numbers1 = {9, 5, 1, 4, 3};
        Arrays.sort(numbers1);
        for (int i: numbers1){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.fill(numbers, 10);
        for (int i: numbers){
            System.out.print(i + " ");
        }
    }
}
/**
 * output:
 * 3
 * 1 3 4 5 9
 * 10 10 10 10 10
 */