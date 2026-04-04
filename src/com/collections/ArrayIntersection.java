package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
	public static int[] intersectionon(int[] a,int[] b) {
		Set<Integer> set1=new HashSet<>();
		Set<Integer> result=new HashSet<>();
		
		for(int num:a) {
			set1.add(num);
		}
		
		for(int num:b) {
			if(set1.contains(num)) {
				result.add(num);
			}
		}
		
		
		return result.stream().mapToInt(i->i).toArray();
	}

	public static void main(String[] args) {
		int[] a= {1,2,3,2};
		int[] b= {2,3,4};
		
		System.out.println(Arrays.toString(intersectionon(a,b)));
	}

}
