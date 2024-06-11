package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.dto.Purchase;
import com.everythingchess.shop.app.dto.PurchaseResponse;
import com.everythingchess.shop.app.entity.Address;
import com.everythingchess.shop.app.entity.Order;
import com.everythingchess.shop.app.entity.Product;
import com.everythingchess.shop.app.entity.User;
import com.everythingchess.shop.app.repository.AddressRepository;
import com.everythingchess.shop.app.repository.OrderRepository;
import com.everythingchess.shop.app.repository.ProductRepository;
import com.everythingchess.shop.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    private final UserRepository userRepository;
    private final OrderRepository orderRepository;
    private final AddressRepository addressRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CheckoutServiceImpl(OrderRepository orderRepository, AddressRepository addressRepository, UserRepository userRepository, UserRepository userRepository1, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.addressRepository = addressRepository;
        this.userRepository = userRepository1;
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(String email, Purchase purchase) {
        User user = userRepository.findByEmail(email).orElseThrow();
        purchase.getOrder().setUser(user);
        purchase.getOrder().getAddress().setUser(user);
        List<Product> products = fetchProducts(purchase);
        setUnitPriceForOrderItems(purchase, products);
        Address address = addressRepository.save(purchase.getOrder().getAddress());
        Order order = createOrder(purchase, address);
        addOrderItemsToOrder(purchase, order);
        orderRepository.save(order);
        return new PurchaseResponse(order.getTrackingNumber());
    }

    private void addOrderItemsToOrder(Purchase purchase, Order order) {
        purchase.getOrder().getOrderItems().forEach(order::addOrderItem);
    }


    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }


    private List<Product> fetchProducts(Purchase purchase) {
        return productRepository.findAllById(purchase.getOrder().getOrderItems().stream()
                .map(orderItem -> orderItem.getProduct().getId())
                .toList());
    }

    private Order createOrder(Purchase purchase, Address address) {
        Order order = new Order();
        order.setUser(purchase.getOrder().getUser());
        order.setAddress(address);
        order.setTotalPrice(purchase.getOrder().getTotalOrderPrice());
        order.setOrderStatus("PROCESSING");
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setTrackingNumber(orderTrackingNumber);
        return order;
    }

    private void setUnitPriceForOrderItems(Purchase purchase, List<Product> products) {
        purchase.getOrder().getOrderItems().forEach(orderItem -> {
            products.forEach(product -> {
                if (product.getId().equals(orderItem.getProduct().getId())) {
                    orderItem.setUnitPrice(product.getUnitPrice());
                }
            });
        });
    }
}