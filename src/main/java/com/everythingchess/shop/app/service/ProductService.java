package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Page<Product> getAllProducts(Pageable pageable);
    Optional<Product> getProductById(Long id);
    Page<Product> getProductByCategoryId(Long id, Pageable pageable);
    Page<Product> getProductByNameContaining(String name, Pageable pageable);

}
