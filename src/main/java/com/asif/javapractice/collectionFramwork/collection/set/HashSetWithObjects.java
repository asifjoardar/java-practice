package com.asif.javapractice.collectionFramwork.collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetWithObjects {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("asif", 2));
        studentSet.add(new Student("joardar", 1));
        studentSet.add(new Student("rahman", 4));
        studentSet.add(new Student("john", 2));

        Student s1 = new Student("a", 2);
        Student s2 = new Student("b", 2);

        System.out.println(s1.equals(s2));

        System.out.println(studentSet);
    }
}

