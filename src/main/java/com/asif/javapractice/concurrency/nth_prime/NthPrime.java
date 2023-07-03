package com.asif.javapractice.concurrency.nth_prime;

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        int number;

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell the nth prime number, Enter n: ");
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    int number = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("\n Result:");
                    System.out.println("\n Value of " + n + "th prime: " + number);
                }
            };
            Thread t = new Thread(r);
            t.start();

        }
    }
}
