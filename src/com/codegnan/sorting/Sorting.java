package com.codegnan.sorting;

public class Sorting { 

    public static int findit(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty...");
            return 0;
        }

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {2,2,2};

        System.out.println(findit(arr));
    }
}