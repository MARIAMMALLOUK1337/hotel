package com.example.test.services;

import com.example.test.entities.Client1;
import com.example.test.repositiries.Client1Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Client1ServiceImplementation implements Client1Service {
    private Client1Repository client1Repository;

    @Override
    public Client1 saveClient1(Client1 client1) {
        return client1Repository.save(client1);
    }

    @Override
    public Client1 updateClient1(Client1 client1) {
        return client1Repository.save(client1);
    }

    @Override
    public void deleteClient1ById(Long id) {
        client1Repository.deleteById(id);
    }

    @Override
    public void deleteAllClient1() {
        client1Repository.deleteAll();
    }

    @Override
    public Client1 getClient1ById(Long id) {
        return client1Repository.findById(id).get();
    }

    @Override
    public List<Client1> getAllClient1() {
        return client1Repository.findAll();
    }
}
