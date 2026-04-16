package com.foodapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testPlaceOrder() {
        OrderService service = new OrderService();
        assertEquals("Order Placed",
                service.placeOrder(new Order(1, "Pizza", "Placed")));
    }

    @Test
    void testDuplicateOrder() {
        OrderService service = new OrderService();
        service.placeOrder(new Order(1, "Pizza", "Placed"));
        assertEquals("Duplicate Order!",
                service.placeOrder(new Order(1, "Burger", "Placed")));
    }

    @Test
    void testTrackOrder() {
        OrderService service = new OrderService();
        service.placeOrder(new Order(1, "Pizza", "Delivered"));
        assertEquals("Delivered", service.trackOrder(1));
    }
}