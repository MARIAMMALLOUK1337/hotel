package com.example.test.repositiries;

import com.example.test.entities.Client1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Client1Repository extends JpaRepository<Client1, Long> {
}
