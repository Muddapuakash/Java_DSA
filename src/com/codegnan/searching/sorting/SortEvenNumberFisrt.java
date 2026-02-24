package com.codegnan.searching.sorting;

import java.util.Arrays;

public class SortEvenNumberFisrt {
	public static void main(String[] args) {
		int[] arr= {23,86,56,47,92,77,93};
		BubbleSort(arr);
	}

	private static void BubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
				
				
			for(int j=0;j<arr.length-1;j++) {
				
				int first1=arr[j]%2;
				int first2=arr[j+1]%2;
				if(first1>first2) {
					//swapping of two elements
					int temp=arr[j];   
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				
				}
			}
		
		}
		System.out.println(Arrays.toString(arr));
		
	}


}
