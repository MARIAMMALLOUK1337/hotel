package com.example.test.services;

import com.example.test.entities.Client1;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Client1Service {
    Client1 saveClient1 (Client1 client1);
    Client1 updateClient1(Client1 client1);
    void deleteClient1ById(Long id);
    void deleteAllClient1();
    Client1 getClient1ById(Long id);
    List<Client1> getAllClient1();

}