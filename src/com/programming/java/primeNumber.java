package com.programming.java;

public class primeNumber {
    public static void main(String[] args) {
        int num = 130;
       checkNumber(num);
    }
    public static void checkNumber(int num){
       int flag = 0;
       if(num < 2){
           System.out.println("Number shoud be greater");
           flag =1;
       }
       else {
           for(int i =2; i<= num/2; i++){
               if(num %i ==0){
                   System.out.println("Number is not prime");
                   flag =1;
                   break;
               }
           }
       }
       if(flag ==0){
           System.out.println("Number is prime");
       }
    }
}
