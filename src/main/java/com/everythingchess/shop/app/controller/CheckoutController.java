package com.everythingchess.shop.app.controller;

import com.everythingchess.shop.app.dto.Purchase;
import com.everythingchess.shop.app.dto.PurchaseResponse;
import com.everythingchess.shop.app.service.CheckoutService;
import com.everythingchess.shop.app.service.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;
    private final JwtService jwtService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService, JwtService jwtService) {
        this.checkoutService = checkoutService;
        this.jwtService = jwtService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase, HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        String jwt = authHeader.substring(7);
        String userEmail = jwtService.extractUsername(jwt);
        return checkoutService.placeOrder(userEmail, purchase);
    }
}
