package com.rodero.roderows.domain.service;

import com.rodero.roderows.application.dto.EquipmentDTO;
import com.rodero.roderows.domain.repository.EquipmentRepository;
import com.rodero.roderows.infrastructure.mapper.EquipmentMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EquipmentService {

    private EquipmentRepository equipmentRepository;
    private EquipmentMapper equipmentMapper;

    public EquipmentDTO add(EquipmentDTO equipmentDTO) {
        return equipmentMapper.toDTO(equipmentRepository.save(equipmentMapper.toEntity(equipmentDTO)));
    }

    public Page<EquipmentDTO> findAll(Pageable pageable) {
        return equipmentRepository
                .findAll(pageable)
                .map(equipmentMapper::toDTO);
    }

    public Optional<EquipmentDTO> findById(final Long id) {
        return equipmentRepository
                .findById(id)
                .map(equipmentMapper::toDTO);
    }

    public EquipmentDTO handleEquipment(EquipmentDTO equipmentDTO) {
        return this.findById(equipmentDTO.getId()).orElse(add(equipmentDTO));
    }

}
