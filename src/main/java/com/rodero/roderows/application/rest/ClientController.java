package com.rodero.roderows.application.rest;

import com.rodero.roderows.application.dto.ClientDTO;
import com.rodero.roderows.domain.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")//TODO TEMP
@RequestMapping("api/v1/client")
public class ClientController {

    private ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientDTO> add(@RequestBody @Valid ClientDTO clientDTO) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(clientService.add(clientDTO));
    }

    @GetMapping
    public ResponseEntity<Page<ClientDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(clientService.findAll(pageable));
    }

    @GetMapping("{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable("id") Long id) {
        return clientService
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("{id}")
    public ResponseEntity<ClientDTO> update(@PathVariable("id") final Long id, @RequestBody @Valid ClientDTO clientDTO) {
        return clientService
                .update(id, clientDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

//    @DeleteMapping("{id}")
//    public ResponseEntity<Void> deleteById(@PathVariable("id") final Long id) {
//        clientService.deleteById(id);
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .build();
//    }

}
