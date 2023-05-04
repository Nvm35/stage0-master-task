package com.epam.loops;


import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        // Check if the input number is positive
        if (numberTableToPrint < 0) {
            System.out.println("The number should be positive");
            return;
        }

        // Print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + (numberTableToPrint * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printTable(number);

        scanner.close();
    }
}
