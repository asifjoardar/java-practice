package com.asif.javapractice.collectionFramwork.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExmple {
    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(23);
        dq.offerFirst(12);
        dq.offerLast(45);
        dq.offer(26);

        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
    }
}
/**
 * output:
 * [12, 23, 45, 26]
 * 12
 * 12
 * 26
 * 12
 * 23
 * 26
 */