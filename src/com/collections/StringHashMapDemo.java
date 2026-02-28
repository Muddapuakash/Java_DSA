package com.collections;

import java.util.HashMap;
import java.util.Map;

public class StringHashMapDemo {

    public static void main(String[] args) {

        String st = "success";
        char[] ch = st.toCharArray();

       
        Map<Character, Integer> map = new HashMap<>();

        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
                               
        }
       

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Char: " + entry.getKey() + " appears: " + entry.getValue());
        }
    }
}