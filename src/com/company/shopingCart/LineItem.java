package com.company.shopingCart;

import java.util.Objects;

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

    public void increaseQuantityBy(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineItem lineItem = (LineItem) o;
        return Objects.equals(product, lineItem.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}
