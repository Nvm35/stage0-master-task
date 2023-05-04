package com.epam.OOP;

public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String pluralPaw = (getNumberOfPaws() == 1) ? "paw" : "paws";
        String hasFurStr = (isHasFur()) ? "a" : "no";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + pluralPaw + " and " + hasFurStr + " fur. Moreover, it has 2 wings and can fly.";
    }


}
