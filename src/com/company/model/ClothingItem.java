package com.company.model;

public class ClothingItem {

    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";

    private String type;
    private ClothingSize size;
    private double price;
    private int quantity;

    public String getType() {
        return type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ClothingItem(String type) {
        this.type = type;
    }
    public ClothingItem(String type, ClothingSize size) {
        this.type = type;
        this.size = size;
    }
    public ClothingItem(String type, ClothingSize size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }
    public ClothingItem(String type, ClothingSize size, double price, int quantity) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }
}
