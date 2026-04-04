package com.collections;

import java.util.HashMap;
import java.util.Map;
public class LongestSequence1 
{
	public int longestsq(int nums[]) {
		
		int longest=0;
		Map<Integer,Boolean> expmap=new HashMap<>();
		for(int num:nums) 
		{
			expmap.put(num, Boolean.FALSE);
		}
		for(int num:nums)
		{
			int currentLength=1;
			int nextNum=num+1;
			//forward
			while(expmap.containsKey(nextNum) && expmap.get(nextNum)==false)
			{
				currentLength++;
				expmap.put(nextNum,Boolean.TRUE);
				nextNum++;
			}
			//backward
			int prevnum=num-1;
			while(expmap.containsKey(prevnum) && !expmap.get(prevnum)) 
			{
				currentLength++;
				expmap.put(prevnum, Boolean.TRUE);
				prevnum--;
			}
			longest=Math.max(longest, currentLength);
		}
		return longest;
	}
public static void main(String[] args) {
	LongestSequence1  d=new LongestSequence1 ();
	int nums[]= {-1,0,1,2,7,100};
	int result=d.longestsq(nums);
	System.out.println("longest seq: "+result);
}
}
