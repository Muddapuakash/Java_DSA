package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringSort {
	/*public static void Sort(String[] arr) {
	 Arrays.sort(arr);
	 for(int i=0;i<arr.length-1;i++) {
			boolean isSorted = false;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j].length()>arr[j+1].length())
				{
					//swapping of two elements
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSorted=true;
				}
				
			}
			if(!isSorted) break;
		}
			
	 System.out.println(Arrays.toString(arr));
	}*/
	

	public static void main(String[] args) {
		List<String> words=new ArrayList(Arrays.asList("pie","apple","bananan"));
		words.sort((s1,s2)->{
			int diff=s1.length()-s2.length();
			if(diff!=0) {
				return diff;
			}
			else {
				return s1.compareTo(s2);
			}
		});
		System.out.println(words);

	}

}
