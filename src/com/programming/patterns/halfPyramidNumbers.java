package com.programming.patterns;

public class halfPyramidNumbers {
    public static void main(String[] args) {
        int num =5;
        for(int i =0; i< num; i++){
            for(int j =0; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
