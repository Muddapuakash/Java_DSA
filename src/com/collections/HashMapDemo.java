package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hm=new HashMap();
		
		hm.put(101, 12);
		hm.put(104,67);
		hm.put(105,19);
		
//		hm.put("sathi",899);
//		hm.put("soma",900);
//		hm.put("soma",538);
		System.out.println(hm.get(101));
		System.out.println(hm.get(191));
		System.out.println(hm.getOrDefault(111, 0));
		System.out.println(hm.containsKey(101));
		System.out.println(hm);
		
		//by using iterator(keyset(),entryset())
		
		Set<Entry<Integer,Integer>>  result=hm.entrySet();
		Iterator<Entry<Integer,Integer>> itr=result.iterator();
		while(itr.hasNext()) {
			Entry<Integer,Integer> FinalResult=itr.next();
			System.out.println(FinalResult.getKey()+" "+FinalResult.getValue());
		}
		}

}
