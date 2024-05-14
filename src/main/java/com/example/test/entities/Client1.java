package com.example.test.entities;

import com.example.test.enums.Chambrestate;
import com.example.test.enums.Clientstate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private Double telephone;
    private Clientstate clientstate=Clientstate.Nvclient;
    @OneToMany(mappedBy="client1",fetch = FetchType.LAZY)
    private List<ReservChambre> reservChambres =new ArrayList<>();
}
