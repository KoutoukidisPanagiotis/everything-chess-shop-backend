package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.dto.Purchase;
import com.everythingchess.shop.app.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
