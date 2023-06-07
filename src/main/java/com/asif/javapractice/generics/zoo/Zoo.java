package com.asif.javapractice.generics.zoo;

public class Zoo {
    public static void main(String[] args) {
        /*
        problem1
        Cage cage = new Cage();
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Lion());*/

        /*
        solution1
        Cage<Monkey> cage = new Cage<Monkey>();
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());
        Monkey animal1 = cage.getAnimal1();

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());*/

        /*
        // problem2
        Cage<Monkey> cage = new Cage(new Monkey(), new Lion());
        Monkey animal1 = cage.getAnimal1();*/

        //solution2
        Cage<Monkey> cage = new Cage<Monkey>(new Monkey(), new Monkey());
        Monkey animal1 = cage.getAnimal1();
    }
}
