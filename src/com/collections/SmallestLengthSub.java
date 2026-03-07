package com.collections;

public class SmallestLengthSub {

	public static int minLength(int target,int nums[]) 
	{
		int minLen=Integer.MAX_VALUE;
		
		for(int i=0;i<nums.length;i++) 
		{
			int sum=0;
			for(int j=i;j<nums.length;j++) 
			{
				sum=sum+nums[j];
				if(sum>=target) {
					minLen=Math.min(minLen, j-i+1);
					break;
				}
				
			}
		}
		return minLen==Integer.MAX_VALUE?0:minLen;
	}
	public static void main(String[] args) {
		int[] arr= {2,3,1,2,4,3};
		System.out.println(SmallestLengthSub.minLength(7, arr));
	}


}

