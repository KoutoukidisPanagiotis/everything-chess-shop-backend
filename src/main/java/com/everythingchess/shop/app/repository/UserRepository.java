package com.everythingchess.shop.app.repository;

import com.everythingchess.shop.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin("http://localhost:4200")
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String username);
}
