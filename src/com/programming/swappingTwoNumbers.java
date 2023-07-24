package com.programming;

public class swappingTwoNumbers {
    public static void main(String[] args) {
       int a =10,b= 20; int temp;
        System.out.println(a);
        System.out.println(b);
//       temp =a ;
//       a =b;
//       b =temp;

        a =a+b;
        b =a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
