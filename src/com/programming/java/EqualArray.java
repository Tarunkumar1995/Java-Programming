package com.programming.java;

import java.util.Arrays;

public class EqualArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4,5};
        Boolean isEqual = Arrays.equals(arr1, arr2);
        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("Not");
        }
    }
}
