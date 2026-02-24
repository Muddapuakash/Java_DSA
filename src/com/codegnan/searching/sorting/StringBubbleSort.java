package com.codegnan.searching.sorting;

import java.util.Arrays;

public class StringBubbleSort {

	public static void main(String[] args) {
		String[] arr= {"bahubali","Ramu","Devasena","Kiru"};
		BubbleSort(arr);

	}
	
	public static void BubbleSort(String[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean isSorted = false;
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j].length()>arr[j+1].length()) {
					//swapping of two elements
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSorted=true;
				}
			}
		
			if(!isSorted) break;
		}
		System.out.println(Arrays.toString(arr));
	}

}
