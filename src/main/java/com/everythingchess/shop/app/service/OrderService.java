package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrdersForCurrentUser(String email);
    List<Order> getOrdersForAdmin();
    Order getOrderByTrackingNumber(String trackingNumber);
    Order saveOrder(Order order);
    Order updateOrderStatus(String trackingNumber, String newStatus);
}
