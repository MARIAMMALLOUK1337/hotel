package com.example.test.repositiries;
import com.example.test.entities.ReservChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservChambreRepository extends JpaRepository <ReservChambre, Long> {
}
