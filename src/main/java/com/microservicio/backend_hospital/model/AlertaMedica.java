package com.microservicio.backend_hospital.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlertaMedica {
    private String nombrePaciente;
    private int ritmoCardiaco;
    private double temperatura;
    private int presionSistolica;
    private int presionDiastolica;
    private String observacion;
    private LocalDateTime fechaRegistro;
}
