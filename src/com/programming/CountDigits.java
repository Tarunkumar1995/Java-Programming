package com.programming;

public class CountDigits {
    public static void main(String[] args) {
        int count =0; int num  =12340;

        while(num!=0){
            num = num/10;
            ++count;
        }
        System.out.println(count);
    }
}
