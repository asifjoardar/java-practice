package com.asif.javapractice.generics;

import java.util.Arrays;
import java.util.List;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        int i = 10;
        Integer x = i; // auto boxing
        System.out.println(x);

        Integer y = 20; // Integer y = new Integer(10);
        int j = y; // unboxing
        System.out.println(j);

        //List<int> list = Arrays.asList(10, 20, 30); // will not work
        List<Integer> list = Arrays.asList(11, 21, 31);
        int num = list.get(0);
        System.out.println(num);
    }
}
