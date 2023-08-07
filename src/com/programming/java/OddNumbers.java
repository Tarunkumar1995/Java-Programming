package com.programming.java;

public class OddNumbers {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,12,11};

        for(int i=0 ; i<arr.length; i++){
            if(arr[i] % 2 !=0){
                System.out.println(arr[i]);
            }
        }
    }
}
