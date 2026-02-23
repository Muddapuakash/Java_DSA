package com.codegnan;


public class CharacterInStringArray {
    public static void main(String[] args) {
        String s = "Akash";
        char target = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== target) {
                System.out.println("Found at index: " + i);
                return;
            }
        }
        
        System.out.println("Char is not found"); 
        }
    }
