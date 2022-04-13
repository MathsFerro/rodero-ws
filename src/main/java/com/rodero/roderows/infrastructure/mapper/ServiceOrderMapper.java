package com.rodero.roderows.infrastructure.mapper;

import com.rodero.roderows.application.dto.ServiceOrderDTO;
import com.rodero.roderows.domain.model.ServiceOrder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceOrderMapper {

    ServiceOrder toEntity(ServiceOrderDTO serviceOrderDTO);

    ServiceOrderDTO toDto(ServiceOrder serviceOrder);

}
