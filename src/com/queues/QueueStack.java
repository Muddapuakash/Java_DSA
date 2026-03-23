package com.queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class QueueStack {
	Stack<Integer> inp=new Stack<>();
	Stack<Integer> out=new Stack<>();
	
	//pushing
	  public void push(int val) {
	        inp.push(val);
	    }

	  //poping
	  public int pop() {
		  peek();
		  return out.pop(); //output
	  }
	  //peeking
	  public int peek() {
		  if(out.isEmpty()) {
			  while(!inp.isEmpty()) {
				  out.push(inp.pop());
			  }
		  }
		  return out.peek();		
	  }
	  //empty
	  public boolean empty() {
		  return inp.isEmpty() && out.isEmpty()	;
				  }
	
	public static void main(String[] args) {
		QueueStack q=new QueueStack();
		q.push(10);
		q.push(20);
		q.push(30);
		System.out.println("first element: "+q.peek());
		System.out.println("pop element: "+q.pop());
		System.out.println("first element: "+q.peek());
		System.out.println("empety elemnets: "+q.empty());
		+
		
	}

}
