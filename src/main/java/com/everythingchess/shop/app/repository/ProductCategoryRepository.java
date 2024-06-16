package com.everythingchess.shop.app.repository;

import com.everythingchess.shop.app.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
