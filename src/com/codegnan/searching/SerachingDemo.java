package com.codegnan.searching;

public class SerachingDemo {
	public static void SearchMethod(int[] nums,int target) {
		int left = 0;
	    int right = nums.length-1;
	    while(left <= right) {
	        int mid = left+ (right-left) / 2;
	        if(nums[mid] == target) {
	            System.out.println(mid);
	        }
	        else if(nums[mid] < target) {
	            left = mid + 1;
	        }
	        else {
	            right = mid - 1;
	        }
	    }

	    System.out.printf("index: %d",left);
	}

	public static void main(String[] args) {
		int arr[]= {1,3,5,6};
		int target=10;
		
		SearchMethod(arr,target);

	}

}
