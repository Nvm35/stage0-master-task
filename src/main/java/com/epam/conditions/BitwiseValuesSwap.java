package com.epam.conditions;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        System.out.println("Before swap:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);

        first ^= second;
        second ^= first;
        first ^= second;

        System.out.println("After swap:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);
    }
}

