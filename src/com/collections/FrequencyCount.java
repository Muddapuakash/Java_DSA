package com.collections;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
  public static void main(String[] args) {
	int[]  arr= {1,2,1,3,1,2};
	
	HashMap<Integer,Integer> hashMap=new HashMap<>();
	
	for(int num:arr) {
		hashMap.put(num,hashMap.getOrDefault(num,0)+1);
	}  
	
	for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
	}
}
}
