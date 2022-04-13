package com.rodero.roderows.infrastructure.mapper;

import com.rodero.roderows.application.dto.EquipmentDTO;
import com.rodero.roderows.domain.model.Equipment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EquipmentMapper {

    Equipment toEntity(EquipmentDTO equipmentDTO);

    EquipmentDTO toDTO(Equipment equipment);

}
