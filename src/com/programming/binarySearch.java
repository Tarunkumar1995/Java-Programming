package com.programming;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] array = { 12, 45, 67, 89, 34, 55, 21 };
        int key = 89;
       // System.out.println(SortingArray(array));
        SortingArray(array);
        binarySearch(array,key);
    }

    public static /*String*/ int[] SortingArray(int[] arr){
        int temp;
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
     //   return Arrays.toString(arr);
        return arr;
    }

    public static void binarySearch(int[] array, int key){

        int first = 0;
        int last =array.length -1;
        int mid = (first + last)/2;

        while(first <=last){
            if(array[mid] <key){
                first = mid + 1;
            } else if (array[mid] == key) {
                System.out.println("The Element is found " + mid);
                break;
            }
            else{
                last = mid -1;
            }

            mid =(first + last)/2;
        }
         if(first >last){
             System.out.println("Element is not found");
         }
    }

}
