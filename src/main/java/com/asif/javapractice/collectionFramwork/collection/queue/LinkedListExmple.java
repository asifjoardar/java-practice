package com.asif.javapractice.collectionFramwork.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExmple {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}

/**
 * output:
 * [1, 2, 3]
 * 1
 * [2, 3]
 * 2
 */