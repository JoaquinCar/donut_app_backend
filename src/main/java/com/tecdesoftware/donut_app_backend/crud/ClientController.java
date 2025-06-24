package com.tecdesoftware.donut_app_backend.crud;

import com.tecdesoftware.donut_app_backend.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    @GetMapping("/get/clients")
    public Iterable<Client> getAllClients() {
        return clientCrudRepository.findAll();
    }

    @PostMapping("/crear/cliente")
    public Client createClient(@RequestBody Client client) {
        return clientCrudRepository.save(client);
    }
}
