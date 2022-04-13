package com.rodero.roderows.domain.service;

import com.rodero.roderows.domain.repository.ClientRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ClientServiceTest {

    @Autowired
    private ClientService clientService;
    @MockBean
    private ClientRepository clientRepository;


}
