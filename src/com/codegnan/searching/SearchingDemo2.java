package com.codegnan.searching;

public class SearchingDemo2 {

    public static int firstIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid;
                right = mid - 1;  
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int lastIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;    
            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;  
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 8;
        int first = firstIndex(arr, target);
        int last = lastIndex(arr, target);
        System.out.println("First Index: " + first);
        System.out.println("Last Index: " + last);
    }
}