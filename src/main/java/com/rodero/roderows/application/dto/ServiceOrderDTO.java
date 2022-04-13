package com.rodero.roderows.application.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.rodero.roderows.domain.model.Client;
import com.rodero.roderows.domain.model.Equipment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderDTO {

    private Long id;
    private Equipment equipment;
    private Client client;

}
