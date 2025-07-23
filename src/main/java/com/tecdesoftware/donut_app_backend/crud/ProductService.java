package com.tecdesoftware.donut_app_backend.crud;

import com.tecdesoftware.donut_app_backend.crud.ProductCrudRepository;
import com.tecdesoftware.donut_app_backend.entity.Category;
import com.tecdesoftware.donut_app_backend.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductCrudRepository productCrudRepository;


    public Optional<List<Product>> getProductsByCategory(Category category) {
        return productCrudRepository.getProductByCategory(category);
    }

}