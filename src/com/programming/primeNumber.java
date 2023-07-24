package com.programming;

public class primeNumber {
    public static void main(String[] args) {
        int num =11;
        for(int i =2; i<=num/2; i++){
            if(num%i ==0 ){
                System.out.println("number is not prime");
                break;
            }
            else System.out.println("prime");break;
        }
    }
}
