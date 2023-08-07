package com.programming.java;

public class Strings2 {
    public static void main(String[] args) {
        String blogName = "    how     to do in java    ";
     //  blogName = blogName.trim();
        blogName = blogName.strip();
        System.out.println(blogName);
    }
}
