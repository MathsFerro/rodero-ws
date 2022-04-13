package com.rodero.roderows.application.rest;

import com.rodero.roderows.application.dto.EquipmentDTO;
import com.rodero.roderows.domain.service.EquipmentService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/equipment")
public class EquipmentController {

    private EquipmentService equipmentService;

    @PostMapping
    public ResponseEntity<EquipmentDTO> add(@RequestBody @Valid EquipmentDTO equipmentDTO) {
        return ResponseEntity.ok(equipmentService.add(equipmentDTO));
    }

    @GetMapping
    public ResponseEntity<Page<EquipmentDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(equipmentService.findAll(pageable));
    }
}
