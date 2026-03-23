package com.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();	
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println("All elments: "+q);
		System.out.println("Remove element: "+q.poll());
		System.out.println("remove element: "+q.remove());
		System.out.println("Ftech elemnets: "+q.peek());
		System.out.println("fetch element: "+q.element());
		System.out.println("print elments: "+q);
		System.out.println("is emepty: "+q.isEmpty());
		System.out.println("Size is: "+q.size());
	}

}
