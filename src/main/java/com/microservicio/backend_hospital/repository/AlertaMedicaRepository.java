package com.microservicio.backend_hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservicio.backend_hospital.model.AlertaMedicaEntity;

@Repository
public interface AlertaMedicaRepository extends JpaRepository<AlertaMedicaEntity, Integer> {
    
}