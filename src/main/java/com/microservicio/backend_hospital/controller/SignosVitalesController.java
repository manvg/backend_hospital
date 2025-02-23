package com.microservicio.backend_hospital.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.backend_hospital.model.SignosVitales;
import com.microservicio.backend_hospital.service.SignosVitales.SignosVitalesService;

@RestController
@RequestMapping("/api/signos-vitales")
public class SignosVitalesController {
    
    @Autowired
    public SignosVitalesService signosVitalesService;

    @GetMapping
    public List<SignosVitales> getAllAlertaMedica() {
        return signosVitalesService.getAllSignosVitalesPacientes();
    }
}
