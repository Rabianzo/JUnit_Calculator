package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAdd() {
        assertEquals(3, Calculator.add(1, 2));
        assertEquals(-2, Calculator.add(-1, -1));
        assertEquals(15, Calculator.add(1, 2, 3, 4, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(3, Calculator.multiply(1, 3));
        assertEquals(-3, Calculator.multiply(-1, 3));
        assertEquals(120, Calculator.multiply(1, 2, 3, 4, 5));
    }
}
