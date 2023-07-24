package com.programming;

import java.util.Arrays;

public class twoArrays {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6};
        int[] arr1 = {3,2,5,7};
        boolean isEqual = Arrays.equals(arr,arr1);
        if(isEqual){
            System.out.println("Equal");
        }
        else{
            System.out.println("False");
        }

    }
}
