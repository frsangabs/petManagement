package com.petshop.petshop_management.Appointment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AppointmentStatus {

    SCHEDULED("Agendado"),
    COMPLETED("Concluído"),
    CANCELED("Cancelado"),
    MISSING("Não compareceu");


    private final String description;

}
