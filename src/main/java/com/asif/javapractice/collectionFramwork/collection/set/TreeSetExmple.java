package com.asif.javapractice.collectionFramwork.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExmple {
    public static void main(String[] args){
        Set<Integer> st = new TreeSet<>();

        st.add(3);
        st.add(2);
        st.add(3);
        st.add(1);
        st.add(4);

        System.out.println(st);

        st.remove(4);

        System.out.println(st);

        System.out.println(st.contains(100));

        System.out.println(st.isEmpty());

        System.out.println(st.size());

        st.clear();

        System.out.println(st);
    }
}

/**
 * output:
 * [1, 2, 3, 4]
 * [1, 2, 3]
 * false
 * false
 * 3
 * []
 */