package com.ab.design.misc;

import java.util.*;

/**
 * @author Arpit Bhardwaj
 *
 * hit(timestamp) – Shows a hit at the given timestamp.
 * getHits(timestamp) – Returns the number of hits received in the past 5 minutes (300 seconds) (from currentTimestamp).
 *
 * Use Queue for bounded buffering
 */
public class HitCounter {

    Queue<Integer> queue;

    public HitCounter() {
        queue = new LinkedList<>();
    }

    //timestamp in sec
    void hit(int timestamp){
        queue.offer(timestamp);
    }

    int getHits(int timestamp){
        while (!queue.isEmpty()
        && timestamp - queue.peek() >= 300){
            queue.poll();
        }

        return queue.size();
    }

    public static void main(String[] args) {
        HitCounter counter = new HitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        System.out.println(counter.getHits(4));
        counter.hit(300);
        System.out.println(counter.getHits(300));
        System.out.println(counter.getHits(301));
    }
}
