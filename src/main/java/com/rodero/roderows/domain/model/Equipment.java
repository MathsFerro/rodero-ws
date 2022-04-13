package com.rodero.roderows.domain.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @JsonBackReference(value = "client")
    private Client client;
    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    @JsonBackReference(value = "service-orders")
    private List<ServiceOrder> serviceOrders;

}
