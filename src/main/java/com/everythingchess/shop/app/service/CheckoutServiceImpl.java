package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.dto.Purchase;
import com.everythingchess.shop.app.dto.PurchaseResponse;
import com.everythingchess.shop.app.entity.Address;
import com.everythingchess.shop.app.entity.Order;
import com.everythingchess.shop.app.entity.Product;
import com.everythingchess.shop.app.repository.AddressRepository;
import com.everythingchess.shop.app.repository.OrderRepository;
import com.everythingchess.shop.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final OrderRepository orderRepository;
    private final AddressRepository addressRepository;

    private final ProductRepository productRepository;

    @Autowired
    public CheckoutServiceImpl(OrderRepository orderRepository, AddressRepository addressRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.addressRepository = addressRepository;
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        List<Product> products = productRepository.findAllById(purchase.getOrder().getOrderItems().stream().map(orderItem -> orderItem.getProduct().getId()).toList());

        purchase.getOrder().getOrderItems().forEach(orderItem -> {
            products.forEach(product -> {
                if (product.getId().equals(orderItem.getProduct().getId())) {
                    orderItem.setUnitPrice(product.getUnitPrice());
                }
            });
        });

        Address address = addressRepository.save(purchase.getOrder().getAddress());
        Order order = new Order();
        order.setUser(purchase.getOrder().getUser());
        order.setAddress(address);
        order.setTotalPrice(purchase.getOrder().getTotalOrderPrice());
        order.setOrderStatus("PROCESSING");
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setTrackingNumber(orderTrackingNumber);

        purchase.getOrder().getOrderItems().forEach(
                order::addOrderItem
        );

        orderRepository.save(order);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}