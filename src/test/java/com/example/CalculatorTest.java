package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    void testSub() {
        assertEquals(5, calc.sub(10, 5));
    }

    @Test
    void testMul() {
        assertEquals(50, calc.mul(10, 5));
    }

    @Test
    void testDiv() {
        assertEquals(2, calc.div(10, 5));
    }

    @Test
    void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> calc.div(10, 0));
    }
}