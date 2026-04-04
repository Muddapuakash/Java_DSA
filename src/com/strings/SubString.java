package com.strings;
public class SubString {

    public static String minwindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] map = new int[128];
        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int left = 0, right = 0;
        int count = t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()) {
            // If current char is needed
            if (map[s.charAt(right)] > 0) {
                count--;
            }
            // Decrease frequency (mark as used)
            map[s.charAt(right)]--;
            right++;
            // When all characters are matched
            while (count == 0) {
                // Update minimum window
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }
                // Try to shrink window
                map[s.charAt(left)]++;
                // If char becomes needed again
                if (map[s.charAt(left)] > 0) {
                    count++;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        String s = "aebdecbcba";
        String t = "abc";
        System.out.println(minwindow(s, t));
    }
}