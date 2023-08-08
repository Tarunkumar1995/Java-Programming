package com.programming.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class reverseLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);

        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
    }
}
