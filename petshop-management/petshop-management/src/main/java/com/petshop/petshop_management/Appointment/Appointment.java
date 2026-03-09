package com.petshop.petshop_management.Appointment;

import java.time.LocalDateTime;

import com.petshop.petshop_management.Pet.Pet;
import com.petshop.petshop_management.ServicePackage.ServicePackage;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pet pet;

    private double price;

    private LocalDateTime dateTime;

    private String observations;

    @ManyToOne
    private ServicePackage servicePackage;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus;

}
