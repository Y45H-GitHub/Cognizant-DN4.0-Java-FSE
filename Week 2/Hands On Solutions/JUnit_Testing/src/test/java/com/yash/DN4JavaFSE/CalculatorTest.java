package com.yash.DN4JavaFSE;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void testIsEvenTrue() {
        assertTrue(calc.isEven(4));
    }

    @Test
    void testIsEvenFalse() {
        assertFalse(calc.isEven(5));
    }
}

