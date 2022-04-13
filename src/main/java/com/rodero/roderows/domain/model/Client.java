package com.rodero.roderows.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @JsonBackReference(value = "address")
    private Address address;
    @OneToMany(mappedBy = "client")
    @JsonBackReference(value = "equipments")
    private List<Equipment> equipments = new ArrayList<>();
    @OneToMany(mappedBy = "client")
    @JsonBackReference(value = "service-orders-client")
    private List<ServiceOrder> serviceOrders = new ArrayList<>();

}
