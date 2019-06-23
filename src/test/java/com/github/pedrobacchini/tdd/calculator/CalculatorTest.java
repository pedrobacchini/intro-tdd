package com.github.pedrobacchini.tdd.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldAddTwoPastValues() {
        int a = 1;
        int b = 2;
        Calculator calculator = new Calculator();
        int sum = calculator.sum(a, b);

        assertEquals(3, sum);
    }

    @Test
    public void shouldSubtractTwoPastValues() {
        int a = 2;
        int b = 1;
        Calculator calculator = new Calculator();
        int subtract = calculator.subtract(a, b);

        assertEquals(1, subtract);
    }

    @Test
    public void shouldDivideTwoPastValues() {
        int a = 6;
        int b = 2;
        Calculator calculator = new Calculator();
        int divide = calculator.divide(a, b);

        assertEquals(3, divide);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldshouldThrowAnExceptionIndicatingFailureToDivideNumberPerZero() {
        int a = 6;
        int b = 0;
        Calculator calculator = new Calculator();
        calculator.divide(a, b);
    }
}