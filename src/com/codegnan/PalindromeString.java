package com.codegnan;

public class PalindromeString {

    public static void main(String[] args) {

        String org = "madam";

        char[] letters = org.toCharArray();
        int left = 0;
        int right = letters.length - 1;
        boolean isPalindrome = true;

        while (left < right) {

            if (letters[left] != letters[right]) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}