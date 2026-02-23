package com.codegnan;

public class StringBinarySearch {

	public static void main(String[] args) {
		String[] fruits= {"Apple","Bananana","pineapple","watermelon"};
		String target="Bananana";     
		int low =0;
		int high=fruits.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int comp=fruits[mid].compareTo(target);
			if(comp==0) {
				System.out.println("Element found: "+mid);
				return;
			}
			else if(comp<0) {
				low=mid+1;
			}          
			else {
				high=mid-1;
			}      
		}
System.out.println("element is not found");
	}

}
