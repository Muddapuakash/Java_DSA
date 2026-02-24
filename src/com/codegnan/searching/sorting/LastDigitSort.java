package com.codegnan.searching.sorting;

//import java.util.Arrays;

public class LastDigitSort {

	public static void main(String[] args) {
		int[] arr= {23,49,22,36};
		BubbleSort(arr);
		for(int arr1:arr) {
			System.out.println(arr1);
		}

	}

	private static void BubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean isSwapped=false;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]%10>arr[j+1]%10) {
					//swapping of two elements
					int temp=arr[j];   
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(!isSwapped) break;
		}
		/* System.out.println(Arrays.toString(arr)); */
	}
	

}
