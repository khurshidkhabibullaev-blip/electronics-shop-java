package com.university.shopping.model;

public class Product {
   public int id;
    public String name;
    public double price;
    public String category;

    public Product (int id, String name, double price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public String getCategory(){return category;}

    public String toString(){
        return "Product: " + name + ", Price: " + price + " USD";
    }




}
