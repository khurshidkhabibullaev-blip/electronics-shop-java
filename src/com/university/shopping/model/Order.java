package com.university.shopping.model;

public class Order {
   public int orderId;
    public User user;
    public Cart cart;
    public double totalAmount;

    public Order(int orderId, User user, Cart cart){
        this.orderId = orderId;
        this.user = user;
        this.cart = cart;
        this.totalAmount = cart.getTotalPrice();
    }

    public void printInvoice(){
        System.out.println("Bill №" + orderId + ";");
        System.out.println("Customer: " + user.username + ";");
        System.out.println("Total price to pay: " + totalAmount + " $");
        System.out.println("===========================");
    }
}
