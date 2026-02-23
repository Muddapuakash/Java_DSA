package com.codegnan.sorting;

import java.util.Arrays;

public class BubbleSort {
    //main method
	public static void main(String[] args) {
		int[] arr= {21,11,16,3,1};
		SortBubble(arr);

	}
	
	
	//descending order
	/*
	 * public static void SortBubble(int[] arr) { int count=0;
	 * 
	 * for(int i=0;i<arr.length-1;i++) {
	 * System.out.println("Sorted Array: "+Arrays.toString(arr)); boolean isSorted =
	 * false; count++; for(int j=0;j<arr.length-1;j++) {
	 * 
	 * if(arr[j]<arr[j+1]) {
	 * 
	 * //swapping of two elements int temp=arr[j]; arr[j]=arr[j+1]; arr[j+1]=temp;
	 * 
	 * isSorted=true; } } if(!isSorted) break; }
	 * System.out.println("How many Swaps: "+count);
	 * 
	 * }
	 */
	
	//bubble sort method  asecnding
	public static void SortBubble(int[] arr) 
	{
		int count=0;
		
		for(int i=0;i<arr.length-1;i++) {
			count++;  
			boolean isSorted = false;
			    
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					//swapping of two elements
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSorted=true;
				}
				
			}
			if(!isSorted) break;
		}
	    System.out.println("Number of Steps: "+count);
		System.out.println("Sorted Array: "+Arrays.toString(arr));

		
	}
	

}
