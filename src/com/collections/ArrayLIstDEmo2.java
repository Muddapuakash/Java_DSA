package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLIstDEmo2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		
		al.add("akash");
		al.add("raju");
		al.add("ramu");
		System.out.println(al);
		
		System.out.println("iterating forwatd direction");
		
		ListIterator<String> itr=al.listIterator();
		while(itr.hasNext()) 
		{
			//System.out.println(itr.next());
			if(itr.next().contains("akash")) {
				itr.set("praveen");
			}
		}
		for(String st:al) {
			System.out.println(st);
		}
	}
	

}
