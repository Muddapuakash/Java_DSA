package com.collections;

import java.util.Arrays;
import java.util.Comparator;
public class NonNegitive {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        String result = String.join("", arr);

        System.out.println(result);
    }
}