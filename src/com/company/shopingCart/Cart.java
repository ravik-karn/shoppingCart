package com.company.shopingCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<LineItem> productsInTheCart;

    public Cart() {
        this.productsInTheCart = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        LineItem item = new LineItem(product, quantity);
        productsInTheCart.add(item);
    }

    public double totalSalesPrice() {
        double salesPrice = 0.0;
        for (LineItem item : productsInTheCart) {
            salesPrice += item.total();
        }
        return salesPrice;
    }
}
