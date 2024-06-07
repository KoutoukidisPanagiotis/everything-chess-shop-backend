package com.everythingchess.shop.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private String orderTrackingNumber;
    private Date dateCreated;
    private double totalPrice;
    private int orderItemQuantity;
    private String address;
    private String status;
}

