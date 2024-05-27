package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.dto.Purchase;
import com.everythingchess.shop.app.dto.PurchaseResponse;
import com.everythingchess.shop.app.entity.Address;
import com.everythingchess.shop.app.entity.Order;
import com.everythingchess.shop.app.entity.OrderItem;
import com.everythingchess.shop.app.entity.User;
import com.everythingchess.shop.app.repository.AddressRepository;
import com.everythingchess.shop.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private UserRepository userRepository;
    private AddressRepository addressRepository;

    @Autowired
    public CheckoutServiceImpl(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Order order = purchase.getOrder();

        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setTrackingNumber(orderTrackingNumber);

        List<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(order::addOrderItem);

        User user = purchase.getUser();
        userRepository.save(user); // Save the User before setting it to the Address

        Address address = purchase.getAddress();
        address.setUser(user); // Set the user property of the Address
        addressRepository.save(address); // Save the Address

        order.setUser(user); // Set the user property of the Order
        order.setAddress(address); // Set the address property of the Order
        userRepository.save(user); // Update the User with the new Order

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}