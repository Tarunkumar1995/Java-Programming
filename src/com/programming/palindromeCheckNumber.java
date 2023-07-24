package com.programming;

public class palindromeCheckNumber {
    public static void main(String[] args) {
        int numberr = 232;

        System.out.println(checkNumber(numberr));
    }
    public static boolean checkNumber(int num){
        int OriginalNumber = num;
        boolean isPalindrome = true;

        int rev =0;
        while(num>0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if(OriginalNumber != rev){
            isPalindrome = false;

        }
        return isPalindrome;
    }


}
