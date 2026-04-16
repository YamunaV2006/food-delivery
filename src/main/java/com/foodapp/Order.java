package com.foodapp;

public class Order {
    public int orderId;
    public String item;
    public String status;

    public Order(int orderId, String item, String status) {
        this.orderId = orderId;
        this.item = item;
        this.status = status;
    }
}