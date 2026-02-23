package com.codegnan.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sortSelection(int[] arr) {
    	int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;  
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;   
                    count++;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];       
            arr[i] = temp;
          
        }
        System.out.println("Number of steps: "+count);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {29, 14, 11, 37, 17};

        sortSelection(arr);
       
    }
}