package com.asif.javapractice.collectionFramwork.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExmple {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(1);
        pq.offer(2);
        pq.offer(3);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());

        Queue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(4);
        pqr.offer(5);
        pqr.offer(6);

        System.out.println(pqr);

        pqr.poll();

        System.out.println(pqr);

        System.out.println(pqr.peek());
    }
}
/**
 *output:
 * [1, 2, 3]
 * [2, 3]
 * 2
 * [6, 4, 5]
 * [5, 4]
 * 5
 */