package com.petshop.petshop_management.Pet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PetSize {

    SMALL("Pequeno"),
    MEDIUM("Médio"),
    LARGE("Grande"),
    GIANT("Gigante");

    private final String description;
    

}
