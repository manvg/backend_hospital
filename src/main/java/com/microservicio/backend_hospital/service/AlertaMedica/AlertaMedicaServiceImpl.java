package com.microservicio.backend_hospital.service.AlertaMedica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.backend_hospital.model.AlertaMedica;
import com.microservicio.backend_hospital.repository.AlertaMedicaRepository;

@Service
public class AlertaMedicaServiceImpl {
    @Autowired
    private AlertaMedicaRepository alertaMedicaRepository;

    //---------GET---------//
    public List<AlertaMedica> getAllAlertaMedica(){
        List<AlertaMedica>  lista = alertaMedicaRepository.findAll();
        return lista; 
    }
}