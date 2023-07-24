package com.programming;

import java.util.Arrays;

public class SumofElementsArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,10};
         // 1st Way
        System.out.println( Arrays.stream(arr).sum());

        //2nd Way
        int sum=0;
        for(int i : arr){
            sum = sum +i;
        }
        System.out.println(sum);

    }
}
