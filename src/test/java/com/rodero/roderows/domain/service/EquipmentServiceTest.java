package com.rodero.roderows.domain.service;

import com.rodero.roderows.domain.repository.EquipmentRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class EquipmentServiceTest {

    @Autowired
    private EquipmentService equipmentService;
    @MockBean
    private EquipmentRepository equipmentRepository;

}