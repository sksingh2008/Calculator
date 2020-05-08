package com.Calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTests {

	private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = calculator.sub(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = calculator.mul(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    
    @Test
    public void testDivide() {
        int a = 50;
        int b = 10;
        int expectedResult = 5;
        int result = calculator.div(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15;
        int b = 0;
        calculator.div(a, b);
    }
}
