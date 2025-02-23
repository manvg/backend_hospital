package com.microservicio.backend_hospital.service.SignosVitales;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.backend_hospital.model.SignosVitales;
import com.microservicio.backend_hospital.model.SignosVitalesPacienteEntity;
import com.microservicio.backend_hospital.repository.SignosVitalesRepository;
import com.microservicio.backend_hospital.utilities.SignosVitalesMapper;

@Service
public class SignosVitalesServiceImpl implements SignosVitalesService {
    @Autowired
    private SignosVitalesRepository signosVitalesRepository;

    //---------GET---------//
    public List<SignosVitales> getAllSignosVitalesPacientes(){
        List<SignosVitalesPacienteEntity> entidades = signosVitalesRepository.findAll();
        return entidades.stream().map(SignosVitalesMapper::toDto).collect(Collectors.toList());
    }
}
