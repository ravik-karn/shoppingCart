package com.company.shopingCart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineItemTest {
    @Test
    public void shouldBeAbleToGetTotalOfFiveProducts() {
        Product product = new Product("Dove", 39.99);
        LineItem items = new LineItem(product, 5);
        assertEquals(199.95, items.total(), 0.001);
    }

    @Test
    public void shouldBeAbleToAddExtraQuantityToTheLineItem() {
        Product product = new Product("Dove", 39.99);
        LineItem items = new LineItem(product, 5);
        items.increaseQuantityBy(3);
        assertEquals(319.92, items.total(), 0.001);
    }
}
