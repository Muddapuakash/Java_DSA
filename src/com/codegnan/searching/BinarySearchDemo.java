package com.codegnan.searching;
public class BinarySearchDemo {
    public static void Bsearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
                return;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {

        int[] arr = {3,7,8,10,9,14};
        int target = 9;

        Bsearch(arr, target);
    }
}