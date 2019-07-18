package com.company.shopingCart;

public class SalesTaxCalculator implements TaxCalculator{
    private static final double SALES_TAX = 0.125;

    @Override
    public double calculateTax(double amount) {
        return amount * SALES_TAX;
    }
}
