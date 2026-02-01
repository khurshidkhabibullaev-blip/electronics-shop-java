package com.university.shopping.model;

import java.util.ArrayList;

public class Cart {

public ArrayList<OrderItem> items = new ArrayList<>();

public void addItem(Product product, int quantity){
    OrderItem newItem = new OrderItem(product, quantity);
    this.items.add(newItem);
}

public double getTotalPrice(){
    double sum = 0;
    for(OrderItem item : items){
        sum = sum + (item.product.price * item.quantity);
    }
    return sum;
}

}

