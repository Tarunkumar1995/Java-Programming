package com.programming.java;

public class Palindrome {
    public static void main(String[] args) {
        String str = "GeeG";
        String rev= "";

        for(int i =str.length()-1; i>=0; i--){
            rev+= str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("Its a Palindrome");
        }
    }
}
