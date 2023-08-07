package com.programming;
//Linear Search is used to find the indexing position of an element
public class LinearSearch {
    public static void main(String[] args) {
        int[] a1= {10,20,30,50,70,90};
        int key =50;
        System.out.println(SearchKey(a1, key));
    }

    public static int SearchKey(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;

    }

}
