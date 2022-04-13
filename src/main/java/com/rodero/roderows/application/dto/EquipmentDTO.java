package com.rodero.roderows.application.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.rodero.roderows.domain.model.Client;
import com.rodero.roderows.domain.model.ServiceOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDTO {

    private Long id;
    private Client client;
    private List<ServiceOrder> serviceOrders;

}
