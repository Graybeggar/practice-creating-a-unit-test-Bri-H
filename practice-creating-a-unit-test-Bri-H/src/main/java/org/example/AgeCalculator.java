package org.example;

public class AgeCalculator {
    public int yearsUntil100(int currentAge) {
        if (currentAge < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        if (currentAge >= 100) {
            return 0;
        }
        return 100 - currentAge;
    }
}