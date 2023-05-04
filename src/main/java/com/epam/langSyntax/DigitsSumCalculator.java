package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int thousandsDigit = number / 1000;
        int hundredsDigit = (number / 100) % 10;
        int tensDigit = (number / 10) % 10;
        int onesDigit = number % 10;

        int sum = thousandsDigit + hundredsDigit + tensDigit + onesDigit;

        System.out.println(sum);
    }
}
