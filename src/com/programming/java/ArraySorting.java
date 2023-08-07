package com.programming.java;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, -2, 4};
        System.out.println(sortingArray(array));
    }

    public static String sortingArray(int[] arr){
        int temp= 0;
        for(int i =0; i< arr.length; i++){
            for(int j =i+1; j< arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]  =temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
