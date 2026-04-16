package com.foodapp;

public class App {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        Order order1 = new Order(1, "Pizza", "Placed");

        System.out.println(service.placeOrder(order1));
        System.out.println(service.trackOrder(1));
    }
}