package com.example.digikala;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;
    private ArrayList<String>comments;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int cnt) {
        this.quantity = cnt;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public ArrayList<String> getComments() {
        return comments;
    }
    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }
}
