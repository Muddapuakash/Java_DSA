package com.collections;

//import java.util.Stack;
import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Vector;

public class List {

	public static void main(String[] args) {
		 ArrayList al=new ArrayList(); //newcap=lowcap+old/2
         //LinkedList al=new LinkedList();
		
		//Vector al=new Vector();
		
		//Stack al=new Stack();
		//System.out.println("initial capacity: "+al.capacity());
		System.out.println("initial size: "+al.size());
	    al.add("bahubali");
	    al.add("true");
	    al.add(null);
	    al.add(new Integer(890));
	    al.add(67.89);
	    al.add(null);
	    al.add(67.89);
	    al.add("bahubali");
	    al.add("true");
	    al.add(null);
	    al.add(new Integer(890));
	    al.add(67.89);
	    al.add(null);
	    al.add(67.89);
	    System.out.println(al);
	   // System.out.println("initial capacity: "+al.capacity());
		System.out.println("initial size: "+al.size());
	    
	   
	}


}

