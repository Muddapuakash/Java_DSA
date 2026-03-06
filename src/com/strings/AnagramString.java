package com.strings;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (c1.length!=c2.length) {
            System.out.println("Not an Anagram");
        } else {
        	if(Arrays.equals(c1,c2))
            System.out.println("It is an Anagram");
        }
    }
}