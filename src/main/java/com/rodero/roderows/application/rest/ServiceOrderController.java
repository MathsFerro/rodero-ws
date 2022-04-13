package com.rodero.roderows.application.rest;

import com.rodero.roderows.application.dto.ServiceOrderDTO;
import com.rodero.roderows.domain.service.ServiceOrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/service-order")
@AllArgsConstructor
public class ServiceOrderController {

    private ServiceOrderService serviceOrderService;

    @PostMapping
    public ResponseEntity<ServiceOrderDTO> add(@RequestBody @Valid ServiceOrderDTO serviceOrderDTO) {
        return ResponseEntity.ok(serviceOrderService.add(serviceOrderDTO));
    }

    @GetMapping("{id}")
    public ResponseEntity<ServiceOrderDTO> findById(@PathVariable("id") final Long id) {
        return serviceOrderService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
