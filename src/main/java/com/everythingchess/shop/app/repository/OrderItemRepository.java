package com.everythingchess.shop.app.repository;

import com.everythingchess.shop.app.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
