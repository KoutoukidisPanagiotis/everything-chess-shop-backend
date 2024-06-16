package com.everythingchess.shop.app.service;

import com.everythingchess.shop.app.entity.ProductCategory;
import com.everythingchess.shop.app.repository.ProductCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public List<ProductCategory> getAllCategories() {
        return productCategoryRepository.findAll();
    }

    @Override
    public Optional<ProductCategory> getCategoryById(Long id) {
        return productCategoryRepository.findById(id);
    }
}
