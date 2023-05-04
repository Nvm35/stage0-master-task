package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;
        if (power < 0) {
            System.out.println("Invalid power value: " + power + ". Power should be a positive integer.");
            return;
        }
        for (int i = 0; i < power; i++) {
            result *= numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(-10, 3);
    }
}

