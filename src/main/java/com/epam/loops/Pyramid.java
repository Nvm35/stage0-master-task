package com.epam.loops;

public class Pyramid {

    public void printPyramid(int height) {
        int center = 1;
        for (int row = 1; row <= height; row++) {
            for (int space = 1; space <= height - row; space++) {
                System.out.print(" ");
            }
            for (int digit = center; digit >= 1; digit--) {
                System.out.print(digit + "");
            }
            for (int digit = 2; digit <= center; digit++) {
                System.out.print(digit + "");
            }
            System.out.println();
            center++;
        }
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
