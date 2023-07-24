package com.programming;

public class EvenNOddDigits {
    public static void main(String[] args) {
        int num = 1234;
        int even_count =0;
        int odd_count =0;

        while(num!=0){
            int rem = num %10;
            if(rem %2 ==0){
                even_count++;
            }
            else odd_count++;

            num = num /10;
        }
        System.out.println("even Count " + even_count + " odd count is " + odd_count );
    }
}
