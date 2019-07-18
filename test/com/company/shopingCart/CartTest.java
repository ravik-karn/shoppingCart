package com.company.shopingCart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void shouldAddFiveDoveInTheCart() {
        Cart cart = new Cart();
        Product product = new Product("Dove", 39.99);
        cart.addItem(product, 5);
        assertEquals(199.95, cart.totalSalesPrice(), 0.01);
    }

    @Test
    public void shouldAddItemOfSameTypeInTheCart() {
        Cart cart = new Cart();
        Product product = new Product("Dove", 39.99);
        cart.addItem(product, 5);
        cart.addItem(product, 3);
        assertEquals(319.92, cart.totalSalesPrice(), 0.01);
    }
}
