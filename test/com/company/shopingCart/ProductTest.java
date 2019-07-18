package com.company.shopingCart;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    @Test
    public void shouldBeAbleToCalculateProductUnitPrice() {
        Product product = new Product("Dove", 39.99);
        assertEquals(39.99, product.unitPrice(), 0.0);
    }
}
