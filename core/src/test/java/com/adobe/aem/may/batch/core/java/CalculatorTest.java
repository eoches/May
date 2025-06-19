package com.adobe.aem.may.batch.core.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testMul() {
        Calculator calc = new Calculator();
        int result = calc.mul(10, 20);
        assertEquals(200, result);
    }
}
