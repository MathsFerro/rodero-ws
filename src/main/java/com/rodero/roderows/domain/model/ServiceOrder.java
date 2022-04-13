package com.rodero.roderows.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class ServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "equipment_id", nullable = false)
    @JsonBackReference(value = "service-orders")
    private Equipment equipment;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @JsonBackReference(value = "service-orders-client")
    private Client client;

    /**
     * Um equipamento pode entrar em várias OS ? SIM
     * Ele possui indentificador único ? Numero de serie ?
     *
     * Caso cliente exista, buscar equipamentos cadastrados anteriormente e colocar como sugestão de add na OS... (ideia)
     * */
}
