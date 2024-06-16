package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.entity.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface ProductCategoryService {
    List<ProductCategory> getAllCategories();

    Optional<ProductCategory> getCategoryById(Long id);
}
