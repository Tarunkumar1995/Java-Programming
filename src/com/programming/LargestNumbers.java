package com.programming;

public class LargestNumbers {
    public static void main(String[] args) {
        int a =5; int b =8; int c =7; int temp;
        int largest;

        temp = a >b? a:b;
        System.out.println(temp);
        largest = c > temp? c:temp;
        System.out.println(largest);

      int   d = c> (a>b? a:b)? c:(a>b? a:b);
        System.out.println(d);
    }


}
