package com.everythingchess.shop.app.repository;

import com.everythingchess.shop.app.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface AddressRepository extends JpaRepository<Address, Long> {
}
