package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    void testAddition(){
        assertEquals(5, calc.add(2,3));
    }
     @Test
    void testDivide(){
        assertEquals(2, calc.divide(10,5));
    }
 @Test
    void testDivideByZero(){
        assertThrows(ArithmeticException.class, ()-> calc.divide(10,0));
    }
}
