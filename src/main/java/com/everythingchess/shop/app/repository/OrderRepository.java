package com.everythingchess.shop.app.repository;

import com.everythingchess.shop.app.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserEmail(String email);

    Optional<Order> findByTrackingNumber(String trackingNumber);
}
