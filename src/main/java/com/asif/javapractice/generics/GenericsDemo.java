package com.asif.javapractice.generics;

import java.util.ArrayList;
import java.util.Date;

public class GenericsDemo {
    public static void main(String[] args) {
        /*ArrayList names = new ArrayList();
        names.add("name 1");
        names.add("name 2");

        String myFirstName = names.get(0); // it will give warning
        System.out.println(names);*/

        /*
        //it will run
        ArrayList names = new ArrayList();
        names.add("name 1");
        names.add("name 2");

        String myFirstName = (String) names.get(0);
        System.out.println(names);*/

        /*ArrayList names = new ArrayList();
        names.add(new Date());
        names.add("name 1");
        names.add("name 2");

        String myFirstName = (String) names.get(0); // it will give "ClassCastException"
        System.out.println(names);*/

        /*ArrayList<String> names = new ArrayList<String>();
        names.add(new Date()); //it will give warning
        names.add("name 1");
        names.add("name 2");

        String myFirstName = names.get(0);
        System.out.println(names);*/

        /*
        // it will run
        ArrayList<String> names = new ArrayList<String>();
        names.add("name 1");
        names.add("name 2");

        String myFirstName = names.get(0);
        System.out.println(names);*/
    }
}
