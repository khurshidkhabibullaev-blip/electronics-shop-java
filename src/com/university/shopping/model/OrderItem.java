package com.university.shopping.model;

public class OrderItem {

    public Product product;
    public int quantity;

    public OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return product.price * quantity;
    }

    public String toString(){
        return product.name + "x" + quantity + "=" + getTotalPrice();
    }

}

