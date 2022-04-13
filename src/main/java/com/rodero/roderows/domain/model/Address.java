package com.rodero.roderows.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cep;
    private String logradouro;
    private String city;
    private String uf;
    @OneToOne(mappedBy = "address")
    @JsonBackReference(value = "client")
    private Client client;

}
