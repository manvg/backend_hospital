package com.microservicio.backend_hospital.service.AlertaMedica;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.backend_hospital.model.AlertaMedica;
import com.microservicio.backend_hospital.model.AlertaMedicaEntity;
import com.microservicio.backend_hospital.repository.AlertaMedicaRepository;
import com.microservicio.backend_hospital.utilities.AlertaMedicaMapper;

@Service
public class AlertaMedicaServiceImpl implements AlertaMedicaService{
    @Autowired
    private AlertaMedicaRepository alertaMedicaRepository;

    //---------GET---------//
    public List<AlertaMedica> getAllAlertaMedica(){
        List<AlertaMedicaEntity> entidades = alertaMedicaRepository.findAll();
        return entidades.stream().map(AlertaMedicaMapper::toDto).collect(Collectors.toList());
    }
}