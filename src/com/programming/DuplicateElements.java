package com.programming;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };

        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] == arr[j] && (i!=j)){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
