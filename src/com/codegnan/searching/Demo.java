package com.codegnan.searching;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        int[] arr1 = {1,2,2,3};
        int[] arr2 = {2,2,3,4};

        int i = 0;
        int j = 0;

        List<Integer> result = new ArrayList<>();

        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        System.out.println(result);
    }
}