package com.foodapp;

import java.util.*;

public class OrderService {
    List<Order> orders = new ArrayList<>();

    public String placeOrder(Order order) {
        for (Order o : orders) {
            if (o.orderId == order.orderId) {
                return "Duplicate Order!";
            }
        }
        orders.add(order);
        return "Order Placed";
    }

    public String trackOrder(int orderId) {
        for (Order o : orders) {
            if (o.orderId == orderId) {
                return o.status;
            }
        }
        return "Order Not Found";
    }
}