package com.company.shopingCart;

public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double total() {
        return quantity * product.unitPrice();
    }
}
