package com.tecdesoftware.donut_app_backend.crud;

import com.tecdesoftware.donut_app_backend.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface ProductCrudRepository extends CrudRepository<Product, Long> {

}
