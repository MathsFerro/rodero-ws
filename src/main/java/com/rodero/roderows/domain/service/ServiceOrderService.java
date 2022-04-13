package com.rodero.roderows.domain.service;

import com.rodero.roderows.application.dto.ServiceOrderDTO;
import com.rodero.roderows.domain.repository.ServiceOrderRepository;
import com.rodero.roderows.infrastructure.mapper.ServiceOrderMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceOrderService {

    private ServiceOrderRepository serviceOrderRepository;
    private ServiceOrderMapper serviceOrderMapper;
    private EquipmentService equipmentService;

    public ServiceOrderDTO add(ServiceOrderDTO serviceOrderDTO) {
        return serviceOrderMapper.toDto(serviceOrderRepository.save(serviceOrderMapper.toEntity(serviceOrderDTO)));
    }

    public Optional<ServiceOrderDTO> findById(final Long id) {
        return serviceOrderRepository.findById(id)
                .map(serviceOrderMapper::toDto);
    }

    public void createNewServiceOrder(ServiceOrderDTO serviceOrderDTO) {
        try {
//            equipmentService.handleEquipment(serviceOrderDTO.getEquipment());

        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }
}
