package com.everythingchess.shop.app.controller;

import com.everythingchess.shop.app.dto.OrderDto;
import com.everythingchess.shop.app.entity.Order;
import com.everythingchess.shop.app.service.JwtService;
import com.everythingchess.shop.app.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class OrderController {
    private final OrderService orderService;
    private final JwtService jwtService;

    public OrderController(OrderService orderService, JwtService jwtService) {
        this.orderService = orderService;
        this.jwtService = jwtService;
    }

    @Operation(summary = "Get orders for current user")
    @ApiResponse(responseCode = "200", description = "Orders retrieved successfully")
    @ApiResponse(responseCode = "403", description = "Invalid credentials")
    @GetMapping("/orders")
    public List<OrderDto> getOrdersForCurrentUser(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        String jwt = authHeader.substring(7);
        String userEmail = jwtService.extractUsername(jwt);
        List<Order> orders = orderService.getOrdersForCurrentUser(userEmail);

        return orders.stream()
                .map(this::mapFromOrderToDto)
                .collect(Collectors.toList());
    }

    @Operation(summary = "Get orders for admin")
    @ApiResponse(responseCode = "200", description = "Orders retrieved successfully")
    @ApiResponse(responseCode = "403", description = "Invalid credentials")
    @GetMapping("/admin-orders")
    public List<OrderDto> getOrdersForAdmin() {
        List<Order> orders = orderService.getOrdersForAdmin();

        return orders.stream()
                .map(this::mapFromOrderToDto)
                .collect(Collectors.toList());
    }

    @Operation(summary = "Update order status")
    @ApiResponse(responseCode = "200", description = "Order status updated successfully")
    @ApiResponse(responseCode = "403", description = "Invalid credentials")
    @PatchMapping("/admin-orders/{trackingNumber}")
    public OrderDto updateOrderStatus(@PathVariable String trackingNumber, @RequestBody String newStatus) {
        Order updatedOrder = orderService.updateOrderStatus(trackingNumber, newStatus);
        return mapFromOrderToDto(updatedOrder);
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
