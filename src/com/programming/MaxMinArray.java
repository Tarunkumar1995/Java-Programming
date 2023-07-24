package com.programming;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] array = {5, 12, 9, 18, 33, 21};
        int minValue =array[0];
        int maxValue =array[0];
        for(int i =1; i<array.length; i++){

           if(array[i] > maxValue){
               maxValue =array[i];
           }

            if(array[i] < minValue){
                minValue =array[i];
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}
