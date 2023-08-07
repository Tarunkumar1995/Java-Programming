package com.programming.java;

public class Strings1 {
    public static void main(String[] args) {
        String str = "   Geeks    for     Geeks";

        str = str.replaceAll("\\s","");
        System.out.println(str);
    }
}
