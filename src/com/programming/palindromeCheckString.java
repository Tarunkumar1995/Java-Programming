package com.programming;

public class palindromeCheckString {
    public static void main(String[] args) {
        String str = "Geeg";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){

        boolean ispalind = true;
        String rev ="";
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }

        if(!str.toLowerCase().equals(rev.toLowerCase())){
            ispalind = false;

        }
        return ispalind;
    }

}
