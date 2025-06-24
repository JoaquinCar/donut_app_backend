package com.tecdesoftware.donut_app_backend.crud;

import com.tecdesoftware.donut_app_backend.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductCrudRepository productCrudRepository;

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return productCrudRepository.findAll();
    }
}
