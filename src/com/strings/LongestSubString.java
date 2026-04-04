package com.strings;

public class LongestSubString {

    public static int longestSubstring(String s, int k) {
        int[] freq = new int[26]; // for A-Z
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Increase frequency
            freq[s.charAt(right) - 'A']++;

            // Track most frequent character
            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);

            // If replacements needed > k → shrink window
            if ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update result
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABCC";
        int k = 2;

        System.out.println(longestSubstring(s, k)); // Output: 4
    }
}