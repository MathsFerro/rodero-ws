package com.rodero.roderows.domain.service;

import com.rodero.roderows.application.dto.ClientDTO;
import com.rodero.roderows.domain.repository.ClientRepository;
import com.rodero.roderows.infrastructure.mapper.ClientMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    public ClientDTO add(ClientDTO clientDTO) {
        return clientMapper.toDTO(clientRepository.save(clientMapper.toEntity(clientDTO)));
    }

    public Page<ClientDTO> findAll(Pageable pageable) {
        return clientRepository
                .findAll(pageable)
                .map(clientMapper::toDTO);
    }

    public Optional<ClientDTO> findById(Long id) {
        return clientRepository
                .findById(id)
                .map(clientMapper::toDTO);
    }

    public Optional<ClientDTO> update(final Long id, ClientDTO clientDTO) {
        return clientRepository
                .findById(id)
                .map(clientFound -> clientMapper.toDTO(clientRepository.save(clientMapper.toEntity(clientDTO))));
    }

}
