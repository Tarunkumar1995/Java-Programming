package com.programming;

public class fibonnacoSeries {
    public static void main(String[] args) {
        //fibanocci is that sum of the two prevoius number is equal to the number which is given

        int num =10;
        for(int i=0; i< num; i++){
            System.out.print(fib(i)+ " ");
        }
    }

    public static int fib(int count){
        if(count <=1)return count;
        return fib(count-1) + fib(count-2);
    }
}
