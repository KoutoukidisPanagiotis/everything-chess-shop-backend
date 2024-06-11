package com.everythingchess.shop.app.repository;

import com.everythingchess.shop.app.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
