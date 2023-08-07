package com.programming.java;
//fibbanoci Series is sum of two previous numbers is eqaul to the current number
public class fibonnacoSeries {
    public static void main(String[] args) {
        int n =10;



    }

    public static int fibbanoci(int count){
        if(count <=1){
            return count;
        }
        return fibbanoci(count -1) + fibbanoci(count-2);
    }

}
