
package com.everythingchess.shop.app.controller;

import com.everythingchess.shop.app.entity.Product;
import com.everythingchess.shop.app.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Operation(summary = "Get all products")
    @ApiResponse(responseCode = "200", description = "Products retrieved successfully")
    @GetMapping
    public Page<Product> getAllProducts(Pageable pageable) {
        return productService.getAllProducts(pageable);
    }

    @Operation(summary = "Get product by id")
    @ApiResponse(responseCode = "200", description = "Product retrieved successfully")
    @GetMapping("{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    @Operation(summary = "Get products by category id")
    @ApiResponse(responseCode = "200", description = "Products retrieved successfully")
    @GetMapping("/search/findByCategoryId")
    public Page<Product> getProductByCategoryId(@RequestParam Long id, Pageable pageable) {
        return productService.getProductByCategoryId(id, pageable);
    }

    @Operation(summary = "Get products by name")
    @ApiResponse(responseCode = "200", description = "Products retrieved successfully")
    @GetMapping("/search/findByNameContaining")
    public Page<Product> getProductByNameContaining(@RequestParam String name, Pageable pageable) {
        return productService.getProductByNameContaining(name, pageable);
    }

}
