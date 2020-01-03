package com.refactoring;

public class Product {

    private String productName;
    private double cost;

    public Product(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
