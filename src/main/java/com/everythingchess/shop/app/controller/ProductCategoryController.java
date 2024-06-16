package com.everythingchess.shop.app.controller;

import com.everythingchess.shop.app.entity.ProductCategory;
import com.everythingchess.shop.app.service.ProductCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product-category")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    @Operation(summary = "Get all product categories")
    @ApiResponse(responseCode = "200", description = "Product categories retrieved successfully")
    @GetMapping
    public List<ProductCategory> getAllCategories() {
        return productCategoryService.getAllCategories();
    }

    @Operation(summary = "Get product category by id")
    @ApiResponse(responseCode = "200", description = "Product category retrieved successfully")
    @GetMapping("{id}")
    public ProductCategory getCategoryById(@PathVariable Long id) {
        return productCategoryService.getCategoryById(id).orElse(null);
    }
}
