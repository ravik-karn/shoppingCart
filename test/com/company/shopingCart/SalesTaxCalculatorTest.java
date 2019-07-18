package com.company.shopingCart;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalesTaxCalculatorTest {
    @Test
    public void shouldCalculateSalesTaxOfFinalAmount() {
        TaxCalculator calculator = new SalesTaxCalculator();
        assertEquals(12.5, calculator.calculateTax(100), 0.0);
    }
}
