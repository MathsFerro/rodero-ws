package com.rodero.roderows.domain.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
public enum EquipmentType {

    COMPUTADOR(0),
    NOTEBOOK(1),
    IMPRESSORA(2);

    private final int id;

    EquipmentType(int id) {
        this.id = id;
    }

    public Optional<EquipmentType> getById(int id) {
        return Arrays
                .stream(EquipmentType.values())
                .filter(equipmentType -> equipmentType.id == id).findFirst();
    }

}
