package com.everythingchess.shop.app.dto;

import com.everythingchess.shop.app.entity.Address;
import com.everythingchess.shop.app.entity.Order;
import com.everythingchess.shop.app.entity.OrderItem;
import com.everythingchess.shop.app.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class Purchase {
    private User user;
    private Address address;
    private Order order;
    private List<OrderItem> orderItems;
}
