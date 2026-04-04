package com.collections;

public class LongestSequence {
	public int longest(int[] nums) {
		int longest=1;
		
		int n=nums.length;
		for(int i=0;i<=n;i++) {
			if(nums[i]=nums[i-1]+1) {
				current++;
			}else if(nums[i])
		}
		
		return longest;
		
	}

	public static void main(String[] args) {
		LongestSequence l=new LongestSequence();
		int nums[]= {100,4,101,1,3,2};
		int result=l.longest(nums);
		System.out.println("Longest Sequenec: "+result);

	}

}
