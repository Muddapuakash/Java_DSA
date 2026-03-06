package com.strings;

public class SentenceString {

    public static void main(String[] args) {
        String sen = "A man,a plan,a canal: Panama";
        sen = sen.toLowerCase();   
        int left = 0;
        int right = sen.length() - 1;
        boolean isPalin = true;
        while (left < right) {
            if(!Character.isLetterOrDigit(sen.charAt(left)))
            {
                left++;
            }      
            else if(!Character.isLetterOrDigit(sen.charAt(right)))
            {
                right--;
            }
            else {
            	if (sen.charAt(left) != sen.charAt(right)) {
                    isPalin = false;
                    break;
                }

                left++;
                right--;
            }
            
        }

        if (isPalin) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}