package com.programming;

public class SumOfDigits {
    public static void main(String[] args) {
//        int n =10;
//        int sum =0;
//        for(int i =0; i<=n; i++){
//            sum = sum +i;
//        }
//        System.out.println(sum);

        int num =13445;
        int sum =0;
        while( num > 0){
           int rem =  num %10;
           sum += rem;
           num = num/10;
        }
        System.out.println(sum);
    }
}
