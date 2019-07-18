package com.company.shopingCart;

public class Product {
    private final String nameOfProduct;
    private final double unitPrice;

    public Product(String nameOfProduct, double unitPrice) {
        this.nameOfProduct = nameOfProduct;
        this.unitPrice = unitPrice;
    }

    public double unitPrice() {
        return unitPrice;
    }
}
