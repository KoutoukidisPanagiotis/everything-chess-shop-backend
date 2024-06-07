package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getFirstName(String email) {
        return userRepository.findByEmail(email).orElseThrow().getFirstName();
    }
}
