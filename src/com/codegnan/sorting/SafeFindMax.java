package com.codegnan.sorting;

public class SafeFindMax {
	public static int findMax(int arr[]) {
		if(arr==null || arr.length==0) {
			System.out.println("invalid array");
			return Integer.MIN_VALUE;
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			 if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        return max;
	}
  public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	System.out.println(SafeFindMax.findMax(arr));
}
}
