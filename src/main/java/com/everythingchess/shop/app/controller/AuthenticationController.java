package com.everythingchess.shop.app.controller;

import com.everythingchess.shop.app.dto.LoginDto;
import com.everythingchess.shop.app.dto.LoginResponse;
import com.everythingchess.shop.app.dto.UserDto;
import com.everythingchess.shop.app.entity.User;
import com.everythingchess.shop.app.service.AuthenticationService;
import com.everythingchess.shop.app.service.JwtService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {
    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public AuthenticationController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @Operation(summary = "Register a new user")
    @ApiResponse(responseCode = "200", description = "User registered successfully")
    @ApiResponse(responseCode = "403", description = "Email already in use")
    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody UserDto registerUserDto) {
        User registeredUser = authenticationService.register(registerUserDto);

        return ResponseEntity.ok(registeredUser);
    }

    @Operation(summary = "Authenticate a user")
    @ApiResponse(responseCode = "200", description = "User authenticated successfully")
    @ApiResponse(responseCode = "403", description = "Invalid credentials")
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginDto loginUserDto) {
        User authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse(jwtToken, (jwtService.getExpirationTime()));

        return ResponseEntity.ok(loginResponse);
    }
}