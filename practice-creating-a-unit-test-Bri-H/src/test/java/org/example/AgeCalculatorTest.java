package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AgeCalculatorTest {

    @Test
    public void testYearsUntil100_HappyPath() {
        AgeCalculator calculator = new AgeCalculator();
        int result = calculator.yearsUntil100(25);
        assertEquals(75, result);
    }

    @Test
    public void testYearsUntil100_Already100() {
        AgeCalculator calculator = new AgeCalculator();
        int result = calculator.yearsUntil100(100);
        assertEquals(0, result);
    }

    @Test
    public void testYearsUntil100_Over100() {
        AgeCalculator calculator = new AgeCalculator();
        int result = calculator.yearsUntil100(105);
        assertEquals(0, result); // no years left to 100
    }

    @Test(expected = IllegalArgumentException.class)
    public void testYearsUntil100_NegativeAge() {
        AgeCalculator calculator = new AgeCalculator();
        calculator.yearsUntil100(-5); // should throw an exception
    }
}