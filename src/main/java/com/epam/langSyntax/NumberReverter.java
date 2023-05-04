package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int onesDigit = number % 10;
        int tensDigit = (number / 10) % 10;
        int hundredsDigit = (number / 100) % 10;

        int reversedNumber = onesDigit * 100 + tensDigit * 10 + hundredsDigit;

        System.out.println(reversedNumber);
    }

}
