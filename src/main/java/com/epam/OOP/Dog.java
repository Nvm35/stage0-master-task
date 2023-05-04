package com.epam.OOP;

public class Dog extends Animal {

    public Dog() {
        super("brown", 4, true);
    }

    @Override
    public String getDescription() {
        String pluralPaw = (getNumberOfPaws() == 1) ? "paw" : "paws";
        String hasFurStr = (isHasFur()) ? "a" : "no";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + pluralPaw + " and " + hasFurStr + " fur.";
    }
}
