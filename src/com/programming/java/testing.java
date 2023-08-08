package com.programming.java;

import static com.programming.fibonnacoSeries.fib;

public class testing {
    public static void main(String[] args) {
//       int num =121;
//      checkPrime(num);

        //Fibbanocci Series

        int  num =10;
//        int ft =0;
//        int st =1;
//        for(int i =1; i<=num; i++){
//            System.out.print(ft + " ");
//            int nt =ft + st;
//            ft =st;
//            st = nt;

        for(int i =0; i<num; i++){
            System.out.print(fibbanociSeries(i) + " ");
    }



    }
//    public static void checkPrime(int num){
//        int flag =0;
//        if(num <=1){
//            System.out.println("Number shoud be greater than 1");
//            flag =1;
//        }
//        else {
//            for(int i =2; i<=num/2; i++){
//                if(num % i ==0){
//                    System.out.println("Number is not Prime");
//                    flag =1;
//                    break;
//                }
//            }
//            if(flag ==0){
//                System.out.println("number is Prime NUmber");
//            }
//        }

    public static int fibbanociSeries(int count){
            if(count <=1){
                return count;
            }
            return fibbanociSeries(count -1) + fibbanociSeries(count -2);
    }

   // }
}
