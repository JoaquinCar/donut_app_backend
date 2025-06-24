package com.tecdesoftware.donut_app_backend.crud;

import com.tecdesoftware.donut_app_backend.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Long> {

}