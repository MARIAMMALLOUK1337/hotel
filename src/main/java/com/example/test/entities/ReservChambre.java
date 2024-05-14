package com.example.test.entities;

import com.example.test.enums.Chambrestate;
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
public class ReservChambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private Date dateDebut;
    private Date dateFin;
    private String chambreclient;
    private Chambrestate chambrestate = Chambrestate.Chambreclean;
    @OneToMany(mappedBy="reservChambre",fetch = FetchType.LAZY)
    private List<Chambre> chambres =new ArrayList<>();
    @ManyToOne
    private Client1 client1;
    @ManyToOne
    private Paiment paiment;


}
