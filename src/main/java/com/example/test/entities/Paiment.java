package com.example.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="Paiment_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Total;
    @OneToMany(mappedBy="paiment",fetch = FetchType.LAZY)
    private List<ReservChambre> reservChambres =new ArrayList<>();
    private boolean type;
}
