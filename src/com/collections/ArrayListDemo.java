package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        
     
        ArrayList al = new ArrayList();
        
      System.out.println("loop1 ");
        for (int i = 0; i <= 10; i++) {
            al.add(i);
        }

       System.out.println("Loop2");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

      
        for ( Object o : al) {
            System.out.println(o);
        }
System.out.println("even number");
        for (Object o1 : al) {
        	Integer i=(Integer)o1;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}