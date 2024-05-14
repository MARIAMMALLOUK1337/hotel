package com.example.test.repositiries;

import com.example.test.entities.Especes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecesRepository extends JpaRepository<Especes, Long> {
}
