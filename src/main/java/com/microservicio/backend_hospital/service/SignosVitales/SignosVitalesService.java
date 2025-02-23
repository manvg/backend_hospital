package com.microservicio.backend_hospital.service.SignosVitales;

import java.util.List;

import com.microservicio.backend_hospital.model.SignosVitales;

public interface SignosVitalesService {
    List<SignosVitales> getAllSignosVitalesPacientes();

}
