package com.microservicio.backend_hospital.service.SignosVitales;

import java.util.List;

import com.microservicio.backend_hospital.model.SignosVitalesPacienteEntity;

public interface SignosVitalesService {
    List<SignosVitalesPacienteEntity> getAllSignosVitalesPacientes();

}
