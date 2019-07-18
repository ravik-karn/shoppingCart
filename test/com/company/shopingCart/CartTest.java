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

    @Test
    public void shouldNotAddSameProductAgainInTheCart() {
        Cart cart = new Cart();
        Product product = new Product("Dove", 39.99);
        cart.addItem(product, 5);
        cart.addItem(product, 3);
        assertEquals(1, cart.totalItem());
    }

    @Test
    public void shouldAddDifferentProductInTheCart() {
        Cart cart = new Cart();
        Product product1 = new Product("Dove", 39.99);
        Product product2 = new Product("AXE Deo", 19.99);
        cart.addItem(product1, 5);
        cart.addItem(product2, 3);
        assertEquals(2, cart.totalItem());
    }

    @Test
    public void shouldComputeSalesTax() {
        Cart cart = new Cart();
        Product product1 = new Product("Dove", 39.99);
        Product product2 = new Product("AXE Deo", 99.99);
        cart.addItem(product1, 2);
        cart.addItem(product2, 2);
        assertEquals(35.00, cart.totalSalesTax(), 0.01);
    }

    @Test
    public void shouldComputeGiveTotalAmount() {
        Cart cart = new Cart();
        Product product1 = new Product("Dove", 39.99);
        Product product2 = new Product("AXE Deo", 99.99);
        cart.addItem(product1, 2);
        cart.addItem(product2, 2);
        assertEquals(314.96, cart.totalPrice(), 0.01);
    }
}
