package com.queues;

import java.util.*;

public class RecentCounter {

    Queue<Integer> q = new LinkedList<>();

    public int ping(int t) {

        q.add(t);

        while(!q.isEmpty() && q.peek() < t - 3000){
            q.poll();
        }

        return q.size();
    }

    public static void main(String[] args) {

        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));     
        System.out.println(rc.ping(100));   
        System.out.println(rc.ping(3001));  
        System.out.println(rc.ping(3002));  
    }
}