package com.everythingchess.shop.app.repository;

import com.everythingchess.shop.app.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orderItems", path = "order-items")
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
