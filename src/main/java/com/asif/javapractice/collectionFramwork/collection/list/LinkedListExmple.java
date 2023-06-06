package com.asif.javapractice.collectionFramwork.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExmple {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        //ArrayList<Integer> arrayList = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(1, 10);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(4);
        newList.add(5);
        System.out.println(newList);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list);

        list.set(1, 10); // update
        System.out.println(list);

        System.out.println(list.contains(3));

        list.clear();
        System.out.println(list);
    }
}
/**
 * [1, 2, 3]
 * [1, 10, 2, 3]
 * [4, 5]
 * [1, 10, 2, 3, 4, 5]
 * 10
 * [1, 2, 3, 4, 5]
 * [1, 10, 3, 4, 5]
 * true
 * []
 */