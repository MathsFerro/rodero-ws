package com.rodero.roderows.application.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.rodero.roderows.domain.model.Address;
import com.rodero.roderows.domain.model.Equipment;
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
public class ClientDTO {

    private Long id;
    private Address address;
    private List<Equipment> equipments;
    private List<ServiceOrder> serviceOrders;

}
