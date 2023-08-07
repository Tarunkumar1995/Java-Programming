package com.programming.java;

public class palindromeNUmber {
    public static void main(String[] args) {
        int num =232;
        int OriginalNum = num;
        int rev =0;
        while(num >0){
            rev = rev *10 + num %10;
            num = num /10;
        }

        if(rev == OriginalNum){
            System.out.println("Numbers are equal");
        }
    }
}
