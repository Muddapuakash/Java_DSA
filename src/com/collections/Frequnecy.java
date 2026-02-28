package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Frequnecy {
	//method to findfreq
//   public static void FindFreq(int arr[]) {
//	//to check array is null or not
//	if(arr==null || arr.length==0) {
//		System.out.println("array is inavalid");
//		return;
//	}
//	//
//	boolean visited[]=new boolean[arr.length];
//	for(int i=0;i<arr.length;i++) {
//		if(visited[i]) {
//			continue;
//		}
//		int count=1;
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]==arr[j]) {
//				count++;
//				visited[j]=true;
//			}
//		}
//		System.out.println(arr[i]+"--->"+count);
//	}
//	
//
//}
//    public static void main(String[] args) {
//        int[] arr= {};
//        FindFreq(arr);
//        
//    }
	
//=---------------------------------------------------------------------	
	//using zeros in arr
	
//		public static void main (String a[]){
//		int count[]=new int[10];
//		int arr1[]=new int[] {1,2,3,1,2,3,1,2};
//		int num=0;
//		
//		
//	for(int i=0;i<arr1.length;i++)
//	{
//		num=arr1[i];
//		count[num]++;
//	}
//		for(int i=0;i<count.length;i++)
//		{
//			if(count[i]>0)
//			{
//			System.out.println(i+"--> " +count[i]);
//		}
//		}
//		}
	//============================================================================
	//optimizing code
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,2,3,1,2}; //array values
		//create map object
		
		Map<Integer,Integer> map=new HashMap(); //empty object created
		for(int num:arr) {
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		
		//printing all the key and values
		
		for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
			System.out.println("number :"+entry.getKey()+" appears :"+entry.getValue());
		}
		
		
	}

	}
