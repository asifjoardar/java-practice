package com.asif.javapractice.generics.zoo1;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> cage = new Cage<Monkey>(new Monkey(), new Monkey());
        Monkey animal1 = cage.getAnimal1();

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();
        Cage.isCompatible(monkey1, monkey2);
    }
}
