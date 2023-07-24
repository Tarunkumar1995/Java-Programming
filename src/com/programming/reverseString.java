package com.programming;

public class reverseString {
    public static void main(String[] args) {
        String name = "Software Programming";

        String rev ="";
        for(int i =name.length()-1; i>=0;i--){
            rev += name.charAt(i);
        }
        System.out.println(rev);
    }
}
