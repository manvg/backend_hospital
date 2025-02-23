package com.microservicio.backend_hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.backend_hospital.model.AlertaMedica;
import com.microservicio.backend_hospital.service.AlertaMedica.AlertaMedicaService;

@RestController
@RequestMapping("/api/alertas-medicas")
public class AlertaMedicaController {
    @Autowired
    private AlertaMedicaService alertaMedicaService;

    @GetMapping
    public List<AlertaMedica> getlAllAlertaMedica(){
        return alertaMedicaService.getAllAlertaMedica();
    }
}
