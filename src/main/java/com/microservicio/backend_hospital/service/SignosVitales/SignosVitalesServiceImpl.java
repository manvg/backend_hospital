package com.microservicio.backend_hospital.service.SignosVitales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.backend_hospital.model.SignosVitalesPacienteEntity;
import com.microservicio.backend_hospital.repository.SignosVitalesRepository;

@Service
public class SignosVitalesServiceImpl {
    @Autowired
    private SignosVitalesRepository signosVitalesRepository;

    //---------GET---------//
    public List<SignosVitalesPacienteEntity> getAllSignosVitales(){
        List<SignosVitalesPacienteEntity>  lista = signosVitalesRepository.findAll();
        return lista; 
    }
}
