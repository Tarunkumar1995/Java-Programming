package com.programming.java;

public class reverseString {
    public static void main(String[] args) {
        String str = "Tarun Kumar";
        String rev="";
        for(int i =str.length()-1; i>=0 ; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
