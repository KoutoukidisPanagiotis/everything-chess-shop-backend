package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.entity.Order;
import com.everythingchess.shop.app.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getOrdersForCurrentUser(String email) {
        return orderRepository.findByUserEmail(email);
    }

    @Override
    public List<Order> getOrdersForAdmin() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderByTrackingNumber(String trackingNumber) {
        return orderRepository.findByTrackingNumber(trackingNumber)
                .orElseThrow(() -> new IllegalArgumentException("Order not found with tracking number: " + trackingNumber));
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrderStatus(String trackingNumber, String newStatus) {
        Order order = getOrderByTrackingNumber(trackingNumber);
        order.setOrderStatus(newStatus);
        return orderRepository.save(order);
    }
}
