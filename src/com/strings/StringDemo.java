package com.strings;

public class StringDemo {

	public static void main(String[] args) {
		String st1="capgemini";
		String st2="capgemeini";
//		System.out.println(st1);
//		String name=st1.concat("india");
//		
//		System.out.println(name);
		
		System.out.println(st1.equals(st2));
		System.out.println(st1==st2);
		//scp:String Constatnt pool
		
		String name1=new String("welcome");
		String name2=new String("welcome");
		System.out.println(name1.equals(name2));
		System.out.println(name1==name2);
	}

}
