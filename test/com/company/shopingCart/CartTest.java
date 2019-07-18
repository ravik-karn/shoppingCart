package com.company.shopingCart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void shouldAddFiveDoveInTheCart() {
        Cart cart = new Cart();
        Product product = new Product("Dove", 39.99);
        cart.addItem(product, 5);
        assertEquals(39.99 * 5, cart.totalSalesPrice(), 0);
    }
}
