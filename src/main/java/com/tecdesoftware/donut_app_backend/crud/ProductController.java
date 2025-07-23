package com.tecdesoftware.donut_app_backend.crud;

import com.tecdesoftware.donut_app_backend.entity.Category;
import com.tecdesoftware.donut_app_backend.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return productCrudRepository.findAll();
    }

    @GetMapping("/by-category/{categoryId}")
    public Optional<List<Product>> getProductsByCategory(@PathVariable Long categoryId) {
        Category category = new Category();
        category.setId(categoryId);
        return productService.getProductsByCategory(category);
    }

}
