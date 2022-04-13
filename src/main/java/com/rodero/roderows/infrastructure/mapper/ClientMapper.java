package com.rodero.roderows.infrastructure.mapper;

import com.rodero.roderows.application.dto.ClientDTO;
import com.rodero.roderows.domain.model.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client toEntity(ClientDTO clientDTO);

    ClientDTO toDTO(Client client);

}
