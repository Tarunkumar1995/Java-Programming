package com.programming.java;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 12, 45, 67, 89, 34, 55, 21 };
        int key = 89;
    }
    
    public static void binarySearch(int[] arr, int key){
        int first = 0;
        int last = arr.length-1;
        int mid = (first + last)/2;
        
        while (first <= last){
            if(arr[mid] < key){
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Postion Found" + mid);
            }
            else {
                last = mid -1;
            }

            mid = (first + last)/2;
        }
        if(first >last){
            System.out.println("Element is not found");
        }
    }
}
