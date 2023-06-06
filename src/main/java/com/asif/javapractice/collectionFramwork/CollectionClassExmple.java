package com.asif.javapractice.collectionFramwork;

import com.asif.javapractice.collectionFramwork.collection.set.Student;

import java.util.*;

public class CollectionClassExmple {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(9);
        list.add(29);
        list.add(76);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 9));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("asif", 2));
        studentList.add(new Student("joardar", 1));
        studentList.add(new Student("rahman", 4));
        studentList.add(new Student("john", 2));

        Collections.sort(studentList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);
    }
}

/**
 * 9
 * 76
 * 2
 * [9, 9, 12, 29, 34, 76]
 * [76, 34, 29, 12, 9, 9]
 * [Student{name='asif', rollNo=2}, Student{name='joardar', rollNo=1}, Student{name='john', rollNo=2}, Student{name='rahman', rollNo=4}]
 */