package com.codegnan;

public class LinerSerach {

	public static void main(String[] args) {
		int[] arr= {12,56,78,34,1,78};
		int target=78;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
			     break;
			}
		}
		System.out.println(index!=-1? "found" : "Not Found");
		System.out.println(index);

	}

}
