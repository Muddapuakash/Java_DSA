package com.collections;

public class SubArray {
	public static int maxSub(int nums[],int k) {
		int maxSum=Integer.MIN_VALUE;
		 for(int i = 0; i <=nums.length-k; i++) {
			 int sum=0;
			 for(int j = i; j < i + k; j++) {
				 sum=sum+nums[j];
			 }
			 maxSum=Math.max(maxSum, sum);
			 
		 }
		 return maxSum;
	}

    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};
        System.out.println(SubArray.maxSub(arr, 3));
    }
}