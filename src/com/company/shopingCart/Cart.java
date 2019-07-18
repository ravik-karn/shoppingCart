package com.company.shopingCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<LineItem> itemsInCart;

    public Cart() {
        this.itemsInCart = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        LineItem itemToBeAdded = new LineItem(product, quantity);
        if (this.isAlreadyAddedInTheCart(itemToBeAdded)) {
            LineItem originalItem = this.find(itemToBeAdded);
            originalItem.increaseQuantityBy(quantity);
            return;
        }
        itemsInCart.add(itemToBeAdded);
    }

    private boolean isAlreadyAddedInTheCart(LineItem itemToBeAdded) {
        for (LineItem item : itemsInCart) {
            if(item.equals(itemToBeAdded)) {
                return true;
            }
        }
        return false;
    }

    private LineItem find(LineItem itemToBeAdded) {
        for (LineItem item : itemsInCart) {
            if(item.equals(itemToBeAdded)) {
                return item;
            }
        }
        return null;
    }

    public double totalSalesPrice() {
        double salesPrice = 0.0;
        for (LineItem item : itemsInCart) {
            salesPrice += item.total();
        }
        return salesPrice;
    }

    public int totalItem() {
        return itemsInCart.size();
    }
}
