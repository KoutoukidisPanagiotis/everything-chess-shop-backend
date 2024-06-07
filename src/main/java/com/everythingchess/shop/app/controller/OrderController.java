package com.everythingchess.shop.app.controller;

import com.everythingchess.shop.app.dto.OrderDto;
import com.everythingchess.shop.app.entity.Order;
import com.everythingchess.shop.app.repository.OrderRepository;
import com.everythingchess.shop.app.service.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class OrderController {
    private final OrderRepository orderRepository;
    private final JwtService jwtService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    public OrderController(OrderRepository orderRepository, JwtService jwtService) {
        this.orderRepository = orderRepository;
        this.jwtService = jwtService;
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrdersForCurrentUser(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        String jwt = authHeader.substring(7);
        String userEmail = jwtService.extractUsername(jwt);
        LOGGER.info ("Fetching orders for user: " + userEmail);
        List<Order> orders = orderRepository.findByUserEmail(userEmail);

        return orders.stream()
                .map(this::mapFromOrderToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/admin-orders")
    public List<OrderDto> getOrdersForAdmin() {
        List<Order> orders = orderRepository.findAll();

        return orders.stream()
                .map(this::mapFromOrderToDto)
                .collect(Collectors.toList());
    }

    private OrderDto mapFromOrderToDto(Order order) {
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderTrackingNumber(order.getTrackingNumber());
        orderDto.setDateCreated(order.getDateCreated());
        orderDto.setTotalPrice(order.getTotalPrice());
        orderDto.setOrderItemQuantity(order.getOrderItems().size());
        orderDto.setAddress(order.getAddress().getAddress());
        orderDto.setStatus(order.getOrderStatus());
        return orderDto;
    }
}
